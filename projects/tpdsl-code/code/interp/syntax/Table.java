/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
***/
import java.util.*;

public class Table {
    public static final Object nil = new Object() {
        public String toString() { return ""; }
    };
    
    String name;
    LinkedHashMap<Object,Row> rows = new LinkedHashMap<Object,Row>();
    List<String> columns = new ArrayList<String>();

    public Table(String name, String primaryKey) {
        this.name = name;
        addColumn(primaryKey);
    }

    public void addColumn(String name) {
        columns.add(name);
    }

    public void add(Row r) {
        String primaryKey = getPrimaryKey();
        Object primaryKeyValue = r.values.get(primaryKey);
        rows.put(primaryKeyValue, r);
    }

    public String getPrimaryKey() {
        return columns.get(0);
    }

    @Override
    public String toString() {
        return "Table{" +
               "name='" + name + '\'' +
               ", rows=" + rows +
               ", columns=" + columns +
               '}';
    }
}
