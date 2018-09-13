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
import mvc.DBConection;

/**
 *
 * @author Admin
 */
public class DemoJDBC_SelectXin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        int ma = 4;
//        String ten = "Nguyen Van C";
//        Date date = new Date();
//        Connection connection = DBConection.open().orElseThrow(new SQLException("ket noi db that bai"));
        Connection connection = DBConection.opencu();
        PreparedStatement prepareStatement = null;
        ResultSet rs = null;
        if (connection != null) {
            try {
                // TODO code application logic here

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
                
            } catch (SQLException ex) {
                Logger.getLogger(DemoJDBC_SelectXin.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                DBConection.close(rs, prepareStatement, connection);
            }
        } else {
            System.out.println("ket noi that bao");
        }
        
    }
    
}
