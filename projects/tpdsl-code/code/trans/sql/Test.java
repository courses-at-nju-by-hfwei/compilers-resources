/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
***/
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.GregorianCalendar;

public class Test {
    public static void main(String[] args) throws SQLException {
        if ( args.length<4 ) {
            System.out.println("Test server db user passwd");
            return;
        }
        String server  = args[0];
        String username  = args[1];
        String password  = args[2];
        String db  = args[3];
        //System.out.print("Testing "+server+"/"+db+":"+username+"/"+password+": ");
        try {
            try {
                // load driver
                Class.forName("com.mysql.jdbc.Driver").newInstance();
            }
            catch (Exception e) {
                System.err.println("Can't find driver");
                System.exit(1);
            }
            String urlString = "jdbc:mysql://"+server+"/"+db;
            Connection con = DriverManager.getConnection(urlString,
                                                         username,
                                                         password);
            // CREATE PERSON AND SERIALIZE
            PersonSerializer.init(con);
            GregorianCalendar cal = new GregorianCalendar(2000,10,5);
            Person p = new Person("ter","555-11-2222",cal.getTime(), 9);
            p.roles = new String[] {"ceo", "janitor"}; 
            PersonSerializer.savePerson(con, p);        // SAVE Person TO DB
            // READ PERSON BACK IN
            String q="SELECT * FROM Person WHERE ID=1"; // GET FIRST Person
            Statement stat = con.createStatement();
            ResultSet rs = stat.executeQuery(q);
            rs.next();
            Person back = PersonSerializer.nextPerson(con, rs);
            System.out.println("read back: "+back);
            rs.close();
            
            con.close();
            System.out.println("OK");
        }
        catch (SQLException se) {
            System.out.println("FAILED");
            se.printStackTrace(System.err);
        }
    }

}
