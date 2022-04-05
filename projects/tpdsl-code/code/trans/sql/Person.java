/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
***/
import java.util.Arrays;
import java.util.Date;

public class Person {
    public String name;     // single-valued fields:
    public String SSN;
    public Date birthDay;
    public int age;
    public String[] roles;  // multi-valued fields:
    public Date[] vacation;

    public Person() {;}

    public Person(String name, String SSN, Date birthDay, int age) {
        this.name = name;
        this.SSN = SSN;
        this.birthDay = birthDay;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
               "name='" + name + '\'' +
               ", SSN='" + SSN + '\'' +
               ", birthDay=" + birthDay +
               ", age=" + age +
               ", roles=" + (roles == null ? null : Arrays.asList(roles)) +
               ", vacation=" + (vacation == null ? null : Arrays.asList(vacation)) +
               '}';
    }
}
