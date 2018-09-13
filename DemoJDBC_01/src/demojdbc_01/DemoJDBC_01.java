/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demojdbc_01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class DemoJDBC_01 {

    /**
     * @param args the command line arguments
     */
    public static String url = "jdbc:mysql://localhost/hvcg";
    public static String user = "hvcg";
    public static String pass = "12345";
    public static String driver = "com.mysql.jdbc.Driver";
    
    public static void main(String[] args) {
        int ma = 4;
        String ten = "Nguyen Van C";
        Date date = new Date();
        Connection connection = null;
        PreparedStatement prepareStatement = null;
        try {
            // TODO code application logic here
            Class.forName(driver);//load cac class cua driver len bo nho de su dung
            connection = DriverManager.getConnection(url, user, pass);//mo ket noi
            String sql = "insert into SinhVien(ma,ten,ngaysinh) values (?,?,?)";//tao st de thuc thi cau lenh
            //con chuoi se dinh sql injection...
            prepareStatement = connection.prepareStatement(sql);//ngay sai lenh nay thi sql da dc bien dich
            prepareStatement.setInt(1, ma);
            prepareStatement.setString(2, ten);
            prepareStatement.setDate(3, new java.sql.Date(date.getTime()));
            int dongBiTuongTac = prepareStatement.executeUpdate();//thuc thi cau lenh
            if (dongBiTuongTac > 0) {
                System.out.println("insert thanh cong");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DemoJDBC_01.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DemoJDBC_01.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            
            try {
                prepareStatement.close();
            } catch (SQLException ex) {
                Logger.getLogger(DemoJDBC_01.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(DemoJDBC_01.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
}
