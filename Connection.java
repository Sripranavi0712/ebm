import java.sql.*;

public class Conn {

    Connection c;
    Statement s;
    Conn() {
        try {
            c = DriverManager.getConnection("jdbc:mysql:///ebm", "root", "Sripranavi@0712");t
            s = c.createStatement();
        }
        catch (Exception e) {
        }
    }
}
