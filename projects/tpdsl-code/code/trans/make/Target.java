/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
***/
import java.util.ArrayList;
import java.util.List;

public class Target {
    String name; 
    List<String> actions = new ArrayList<String>();
    List<String> dependencies = new ArrayList<String>();
    
    public Target(String name) {
        this.name = name;
    }
    
    public void addDependency(String d) { dependencies.add(d); }
    
    public void addAction(String action) { actions.add(action); }

    public int exec() throws Exception {
        if ( actions==null ) return 0;
        for (String action : actions) {
            System.out.println("build("+name+"): "+action);
            Runtime r = Runtime.getRuntime();
            Process p = r.exec(action);
            StreamVacuum stdout = new StreamVacuum(p.getInputStream());
            StreamVacuum stderr = new StreamVacuum(p.getErrorStream());
            stdout.start();
            stderr.start();
            p.waitFor();
            stdout.join();
            stderr.join();
            if ( stdout.toString().length()>0 ) {
                System.out.print(stdout);
            }
            if ( stderr.toString().length()>0 ) {
                System.err.print(stderr);
            }
            if ( p.exitValue()!=0 ) {
                //System.err.println(action+" exited with "+p.exitValue());
                return p.exitValue();
            }
        }
        return 0;
    }
}

