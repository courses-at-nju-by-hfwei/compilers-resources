/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
***/
import org.antlr.runtime.*;

import java.io.InputStream;
import java.io.IOException;
import java.util.*;

public class Interpreter {
    public InterpreterListener listener = // default response to messages
        new InterpreterListener() {
            public void info(String msg) { System.out.println(msg); }
            public void error(String msg) { System.err.println(msg); }
            public void error(String msg, Exception e) {
                error(msg); e.printStackTrace(System.err);
            }
            public void error(String msg, Token t) {
                error("line "+t.getLine()+": "+msg);
            }
        };

    Map<String, Object> globals = new HashMap<String, Object>();
    Map<String, Table> tables = new HashMap<String, Table>();

    public void interp(InputStream input) throws RecognitionException, IOException {
        QLexer lex = new QLexer(new ANTLRInputStream(input));
        CommonTokenStream tokens = new CommonTokenStream(lex);
        QParser parser = new QParser(tokens, this);
        parser.program();
        // System.out.println(tables);
    }

    public void createTable(String name,
                            String primaryKey,
                            List<Token> columns)
    {
        Table table = new Table(name, primaryKey);
        for (Token t : columns) table.addColumn(t.getText());
        tables.put(name, table);
    }

    public void insertInto(String name, Row row) {
        Table t = tables.get(name);
        if ( t==null ) { listener.error("No such table "+name); return; }
        t.add(row);
    }

    public Object select(String name, List<Token> columns) {
        Table table = tables.get(name);
        ResultSet rs = new ResultSet();
        for (Row r : table.rows.values()) rs.add( r.getColumns(columns) );
        return rs;
    }

    public Object select(String name, List<Token> columns, String key, Object value) {
        Table table = tables.get(name);
        ResultSet rs = new ResultSet();
        if ( key.equals(table.getPrimaryKey()) ) {
            List<Object> selectedColumnData =
                table.rows.get(value).getColumns(columns);
            if ( selectedColumnData.size()==1 ) return selectedColumnData.get(0);
            rs.add( selectedColumnData );
            return rs;
        }
        // key isn't the primary key; walk linearly to find all rows satisfying
        for (Row r : table.rows.values()) {
            if ( r.values.get(key).equals(value) ) {
                rs.add( r.getColumns(columns) );
            }
        }
        return rs;
    }

    public void store(String name, Object o) { globals.put(name, o); }

    public Object load(String name) { return globals.get(name); }

    public void print(Object o) {
        if ( o instanceof ResultSet ) { // result set?
            ResultSet rs = (ResultSet)o;
            for (List<Object> r : rs.results) {
                for (int i = 0; i<r.size(); i++) {
                    if ( i>0 ) System.out.print(", ");
                    System.out.print(r.get(i));
                }
                System.out.println();
            }
        }
        else {
            System.out.println(o.toString());
        }
    }
}
