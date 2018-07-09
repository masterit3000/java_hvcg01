/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuabailab1;

/**
 *
 * @author Admin
 */
public class ChuaBaiLab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        KhachHang kh1 = new KhachHang();
        kh1.nhap();
        kh1.hien();
        KhachHang kh2 = new KhachHang();
        kh2.nhap();
        kh2.hien();
        int soSanhTheoTuoi = kh1.soSanhTheoTuoi(kh2);
        switch (soSanhTheoTuoi) {
            case 1:
                System.out.println("Kh1 lon tuoi hon kh2");
                break;
            case -1:
                System.out.println("Kh1 nho tuoi hon kh2");
                break;
            default:
                System.out.println("Kh1 = tuoi  kh2");

        }

    }

}
