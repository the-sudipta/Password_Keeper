
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;


public class databaseConnection {


    final static String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver"; // J connector Registration
    // Path for database connectivity followed by
    final static String DB_URL = "jdbc:mysql://sql6.freemysqlhosting.net:3306/sql6688583"; // database name is passwords

    final static String USER = "sql6688583";
    final static String PASS = "RTG4nEMcwC";
    final static String PORT = "3306";

    public static Connection connection(){

        try {
            Class.forName(JDBC_DRIVER); // for Driver Registration

            Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
            return conn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "DataBaseConnection Error = "+e);
            return null;
        }

    }

}
