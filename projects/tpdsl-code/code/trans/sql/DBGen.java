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

public class DBGen {
    public static void main(String[] args) throws IOException {
        if ( args.length!=1 ) {
            System.err.println("java DBGen [-sql|-java]");
            return;
        }
        String groupFile;
        if ( args[0].equals("-sql") ) groupFile = "SQL2.stg";
        else if ( args[0].equals("-java") ) groupFile = "persist.stg";
        else {System.err.println("java DBGen [-sql|-java]"); return;}
        // LOAD TEMPLATES
        FileReader fr = new FileReader(groupFile);
        StringTemplateGroup templates = new StringTemplateGroup(fr);
        fr.close();
        templates.registerRenderer(Class.class, new TypeRenderer());
        // GEN OUTPUT
        StringTemplate output = gen(templates, Person.class);
        System.out.println(output.toString());
    }
    
    public static StringTemplate gen(StringTemplateGroup templates,
                                     Class c)
    {
        List<Field> fields = new ArrayList<Field>();
        List<Field> arrayFields = new ArrayList<Field>();
        Set<Class> nonPrimitiveTypes = new HashSet<Class>();
        filterFields(c, fields, arrayFields, nonPrimitiveTypes);
        StringTemplate classST = templates.getInstanceOf("output");
        classST.setAttribute("class",             c);
        classST.setAttribute("fields",            fields);
        classST.setAttribute("arrayFields",       arrayFields);
        classST.setAttribute("nonPrimitiveTypes", nonPrimitiveTypes);
        return classST;
    }
    
    protected static void filterFields(Class c, List<Field> fields,
                                       List<Field> arrayFields,
                                       Set<Class> nonPrimitiveTypes)
    {
        for (Field f : c.getFields()) {
            if (f.getType().isArray()) arrayFields.add(f);
            else {
                fields.add(f);
                if (!f.getType().isPrimitive()) {
                    nonPrimitiveTypes.add(f.getType());
                }
            }
        }
    }
}
