/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
***/
import java.io.IOException;
class makefile extends MakeSupport {
    public makefile() throws IOException {
        Target target = null;

	target = new Target("t.o");
	target.addDependency("t.c");
	target.addAction("gcc -c -o t.o t.c");
	targets.put("t.o", target);
	target = new Target("u.o");
	target.addDependency("u.c");
	target.addAction("gcc -c -o u.o u.c");
	targets.put("u.o", target);
	target = new Target("go");
	target.addDependency("t.o");
	target.addDependency("u.o");
	target.addAction("gcc -o go t.o u.o");
	target.addAction("echo done");
	targets.put("go", target);
	target = new Target("clean");
	target.addAction("rm t.o u.o go");
	targets.put("clean", target);
    }   
    
    public static void main(String[] args) throws Exception {
        String target = args[0];
        makefile m = new makefile();
        if ( m.targets.get(target)==null ) {
            System.err.println("No such target: "+target);
            System.exit(-1);
        }
        int r = m.build(target);
        System.exit(r);
    }
}

