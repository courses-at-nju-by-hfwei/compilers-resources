/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
***/
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.ANTLRFileStream;

import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.io.IOException;

public class RunFig {
    // E.g., "$ java RunFig jguru.fig"
    public static void main(String args[]) throws Exception {
        Map<String,Object> config_objects = readFig(args[0]);
        for ( String name : config_objects.keySet() ) {
            System.out.println(name+":"+config_objects.get(name));
        }
    }

    public static Map<String,Object> readFig(String fileName)
        throws IOException, RecognitionException
    {
        // Create lexer attached to character stream from fileName
        FigLexer lexer = new FigLexer(new ANTLRFileStream(fileName));
        // Create a buffer of tokens feeding off of lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // Create parser feeding off of token buffer
        FigParser p = new FigParser(tokens);
        return p.file(); // parse, return dictionary of config'd objects
    }

    public static void setObjectProperty(Object o, String propertyName, Object value) {
        Class c = o.getClass();

        // First see if name is a property ala javabeans
        String methodSuffix = Character.toUpperCase(propertyName.charAt(0))+
            propertyName.substring(1,propertyName.length());
        Method m = getMethod(c,"set"+methodSuffix, new Class[] {value.getClass()});
        if ( m != null ) {
            try {
                invokeMethod(m, o, value);
            }
            catch (Exception e) {
                System.err.println("Can't set property "+propertyName+" using method set"+methodSuffix+
                    " from "+c.getName()+" instance: "+e);
            }
        }
        else {
            // try for a visible field
            try {
                Field f = c.getField(propertyName);
                try {
                    f.set(o, value);
                }
                catch (IllegalAccessException iae) {
                    System.err.println("Can't access property "+propertyName+" using direct field access from "+
                            c.getName()+" instance: "+ iae);
                }
            }
            catch (NoSuchFieldException nsfe) {
                System.err.println("Class "+c.getName()+" has no such property/field: "+propertyName+
                    ": "+nsfe);
            }
        }
    }

    protected static Object newInstance(String name) {
        Object o = null;
        try {
            o = Class.forName(name).newInstance();
        }
        catch (Exception e) {
            System.err.println("can't make instance of "+name);
        }
        return o;
    }

    protected static Method getMethod(Class c, String methodName, Class[] args) {
        Method m;
        try {
            m = c.getMethod(methodName, args);
        }
        catch (NoSuchMethodException nsme) {
            m = null;
        }
        return m;
    }

    protected static Object invokeMethod(Method m, Object o) throws IllegalAccessException, InvocationTargetException {
        return invokeMethod(m, o, null);
    }

    protected static Object invokeMethod(Method m, Object o, Object value) throws IllegalAccessException, InvocationTargetException {
        Object[] args = null;
        if ( value!=null ) {
            args = new Object[] {value};
        }
        value = m.invoke(o, args);
        return value;
    }

}
