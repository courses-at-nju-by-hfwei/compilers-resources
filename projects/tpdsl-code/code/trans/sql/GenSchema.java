/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
***/
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.antlr.stringtemplate.StringTemplate;
import org.antlr.stringtemplate.StringTemplateGroup;

public class GenSchema {
    StringTemplateGroup templates;
    
    public static void main(String[] args) throws Exception {
        GenSchema gen = new GenSchema();
        StringTemplate schemaST = gen.genSchema(Person.class);
        System.out.println(schemaST.toString());
    }
    
    public GenSchema() throws IOException {
        FileReader fr = new FileReader("SQL.stg");
        templates = new StringTemplateGroup(fr);
        fr.close();
    }

    public StringTemplate genSchema(Class c) {
        List<Field> fields = new ArrayList<Field>();
        List<Field> arrayFields = new ArrayList<Field>();
        filterFields(c, fields, arrayFields);
        StringTemplate classST = templates.getInstanceOf("objectTables");
        classST.setAttribute("class",       c);
        classST.setAttribute("fields",      fields);
        classST.setAttribute("arrayFields", arrayFields);
        return classST;
    }
    
    protected void filterFields(Class c, List<Field> fields,
                                List<Field> arrayFields)
    {
        for (Field f : c.getFields()) {
            if (f.getType().isArray()) arrayFields.add(f);
            else fields.add(f);
        }
    }
}
