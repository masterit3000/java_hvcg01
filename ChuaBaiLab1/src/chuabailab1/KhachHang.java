/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuabailab1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class KhachHang {

    public int ma;
    public String ten;
    public ThoiGian ngaySinh;

    public void nhap() {

        System.out.println("Nhap ma, ten");
        this.ma = new Scanner(System.in).nextInt();
        this.ten = new Scanner(System.in).nextLine();
        System.out.println("nhap ngay sinh");
        if (this.ngaySinh == null) {
            this.ngaySinh = new ThoiGian();
        }
        this.ngaySinh.nhap();

    }

    public void hien() {
        System.out.println("ma = " + this.ma + "| ten = " + this.ten);
        if (this.ngaySinh != null) {
            this.ngaySinh.hien();
        }
    }

    public int soSanhTheoTuoi(KhachHang kh) {
        //quy uoc: bang nhau -> 0, this <kh -> -1. this > kh -> 1
        if (kh != null) {
           return this.ngaySinh.soSanh(kh.ngaySinh);
        }
        return 1;

    }

}
