/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demolab2;

/**
 *
 * @author Admin
 */
public class DemoStatic {

    public static void main(String[] args) {

        SanPham sp1 = new SanPham();
        SanPham sp2 = new SanPham();
        SanPham sp3 = new SanPham();
        SanPham sp4 = new SanPham();

        sp1.tenCuaHang = "aaaaaa";
        System.out.println(sp1.tenCuaHang);
        System.out.println(sp2.tenCuaHang);
        System.out.println(sp3.tenCuaHang);
        System.out.println(sp4.tenCuaHang);
        SanPham.tenCuaHang = "vvvvvvvvv";
        System.out.println(sp4.tenCuaHang);
    }

    static {
        System.out.println("ttttttttttttttttttttttttttttttttt");
    }
}
