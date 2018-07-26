/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demointerface.view;

import demointerface.INhanVien;
import demointerface.INhanVienCtrl;
import demointerface.ctrl.NhanVienCtrl;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Menu {

    public static void main(String[] args) {

        System.out.println("1. Nhap");
        System.out.println("1. Hien");
        System.out.println("1. Tim Kiem");
        System.out.println("1. Thoat");
        int chon = new Scanner(System.in).nextInt();
        INhanVienCtrl iqlnv = new DemoNhanVienCtrl();
//        INhanVienCtrl iqlnv = new NhanVienCtrl();
        switch (chon) {
            case 1:
                INhanVien[] ds = iqlnv.taoDanhSach();
                break;
            default:
                throw new AssertionError();
        }
    }

}
