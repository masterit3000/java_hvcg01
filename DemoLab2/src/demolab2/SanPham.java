/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demolab2;

import java.util.Scanner;

/**
 *
 * @author Admin Tai sao phai co contrutor: do nu càu cần chạy câc doạn code khi
 * tạo ra obj
 *
 */
public class SanPham {

    public SanPham(int ma) {
        System.out.println("dang khoi tao sp voi ma : " + ma);
        this.ma = ma;

    }

    public SanPham(int ma, String ten, float gia) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
    }

    public SanPham() {
        //ham dc chay khi khoi tao obj SAnPham
        //ko có kieu tra ve, vi conttuctor phai tra ve chinh obj dc tao ra

        System.out.println("dang khô  tao obj san pham");
    }

    static {
        System.out.println("day la doan code static , se chay 1 lan duy nhat khi bat dau load class nay len bo nho");
    }
    public int ma;
    public String ten;
    public float gia;
    public static String tenCuaHang;//tat ca cac sp chung ten cua hang

    public static void hienTenCuaHang() {
        //trong ham static chi goi bien static , ham static khac
        System.out.println("ten ch = " + tenCuaHang);
//        this.ma=1;
        SanPham sp = new SanPham();
        sp.hien();

    }

    public void hien() {

        System.out.println("ma =" + this.ma);
    }

    public int nhap() {

        System.out.println("nhap ten cua hang");
        SanPham.tenCuaHang = new Scanner(System.in).nextLine();//ham bt, dung bien static bt
        return 0;

    }
}
