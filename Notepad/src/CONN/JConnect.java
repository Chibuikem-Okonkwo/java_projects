//Connecting to SQL db
package CONN;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JConnect {

    public Connection getNewConnection() {

        Connection conn = null;
        String connectionString = "jdbc:mysql://localhost:3306/bank_db";   //java database connection **connection parameters
        String driver = "com.mysql.cj.jdbc.Driver";     //mysql driver
        String userName = "root", password = "123456";
        try {
            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection(connectionString, userName, password);
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(JConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }

    public static void main(String[] args) {

        JConnect jc = new JConnect();

        Connection conn = jc.getNewConnection();
        System.out.println("Connection = " + conn);
    }
}