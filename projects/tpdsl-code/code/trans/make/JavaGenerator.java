/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
***/
import java.io.*;

public class JavaGenerator implements MakeGenerator {
    PrintWriter out;
    String makefile;
    
    public JavaGenerator(String makefile) throws IOException {
        this.makefile = makefile;
        String javafile = makefile+".java";
        //System.out.println(makefile+" to "+javafile);
        out = new PrintWriter(new FileWriter(javafile));
    }
    
    public void start() {
        out.println(
            "import java.io.IOException;\n" +
            "class "+makefile+" extends MakeSupport {\n" +
            "    public "+makefile+"() throws IOException {\n" +
            "        Target target = null;\n");
    }

    public void finish() {
        out.println(
            "    }   \n" +
            "    \n" +
            "    public static void main(String[] args) throws Exception {\n" +
            "        String target = args[0];\n"+
            "        "+makefile+" m = new "+makefile+"();\n"+
            "        if ( m.targets.get(target)==null ) {\n"+
            "            System.err.println(\"No such target: \"+target);\n"+
            "            System.exit(-1);\n"+
            "        }\n"+
            "        int r = m.build(target);\n" +
            "        System.exit(r);\n"+
            "    }\n" +
            "}\n");
        out.close();
    }

    public void target(String t) {
        t = t.trim();
        out.println("\ttarget = new Target(\""+t+"\");");
    }
    
    public void dependency(String d) {
        d = d.trim();
        out.println("\ttarget.addDependency(\""+d+"\");");
    }

    public void action(String a) {
        a = a.trim();
        out.println("\ttarget.addAction(\""+a+"\");");
    }

    public void endTarget(String t) {
        t = t.trim();
        out.println("\ttargets.put(\""+t+"\", target);");
    }
}
