/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demojdbcmvc.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class DBConection {

    public static String url = "jdbc:mysql://localhost/hvcg";
    public static String user = "hvcg";
    public static String pass = "12345";
    public static String driver = "com.mysql.jdbc.Driver";

    public static Optional<Connection> open() {
        try {
            Optional<Connection> optional;
            Class.forName(driver);
            Connection connection = DriverManager.getConnection(url, user, pass);
            optional = Optional.of(connection);
            return optional;
        } catch (SQLException ex) {
            Logger.getLogger(DBConection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBConection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Optional.empty();
    }

    public static Connection opencu() {
        try {
//            Optional<Connection>  optional = new Optional<>();
            Class.forName(driver);
            return DriverManager.getConnection(url, user, pass);
        } catch (SQLException ex) {
            Logger.getLogger(DBConection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBConection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static void close(ResultSet rs, Statement st, Connection cnn) {

        try {
            if (rs != null && !rs.isClosed()) {
                rs.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBConection.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            if (st != null && !st.isClosed()) {
                st.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBConection.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            if (cnn != null && !cnn.isClosed()) {
                cnn.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBConection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
