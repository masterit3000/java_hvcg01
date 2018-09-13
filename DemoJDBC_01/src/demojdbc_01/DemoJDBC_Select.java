/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demojdbc_01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class DemoJDBC_Select {

    /**
     * @param args the command line arguments
     */
    public static String url = "jdbc:mysql://localhost/hvcg";
    public static String user = "hvcg";
    public static String pass = "12345";
    public static String driver = "com.mysql.jdbc.Driver";

    public static void main(String[] args) {
//        int ma = 4;
//        String ten = "Nguyen Van C";
//        Date date = new Date();
        Connection connection = null;
        PreparedStatement prepareStatement = null;
        ResultSet rs = null;
        try {
            // TODO code application logic here
            Class.forName(driver);//load cac class cua driver len bo nho de su dung
            connection = DriverManager.getConnection(url, user, pass);//mo ket noi
            String sql = "select * from sinhvien";//tao st de thuc thi cau lenh
            //con chuoi se dinh sql injection...
            prepareStatement = connection.prepareStatement(sql);//ngay sai lenh nay thi sql da dc bien dich
            rs = prepareStatement.executeQuery(); //thuc thi cau lenh
            while (rs.next()) { //vua next den dong tiep theo, next dc tra ve true, ko next dc tra ve false
                int ma = rs.getInt(1);
                String ten = rs.getString("ten");
                java.sql.Date date = rs.getDate(3);
                Date d = new Date(date.getTime());
                DateFormat format = DateFormat.getDateInstance(DateFormat.LONG, new Locale("vi", "VN"));
                String format1 = format.format(d);
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd*MM*yyyy");
                String format2 = dateFormat.format(d);
                System.out.println(ma + "-" + ten + " - " + format1 + " - " + format2);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DemoJDBC_Select.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DemoJDBC_Select.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            try {
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(DemoJDBC_Select.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                prepareStatement.close();
            } catch (SQLException ex) {
                Logger.getLogger(DemoJDBC_Select.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(DemoJDBC_Select.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
