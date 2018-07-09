/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hvcg_javacore_01;

/**
 *
 * @author Admin
 */
public class KhachHang {

    public int ma;
    public String name;
    public String diaChi;

    public void inThongTin() {
        int ma = 10;
        System.out.println("Ma - " + this.ma);//this la dai dien cho obj hien tai dang goi ham nay chay
        System.out.println("ten - " + this.name);
        System.out.println("Dia chi - " + this.diaChi);
    }
}
