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
public class ThoiGian {

    public final int BANG_NHAU = 0;
    public final int LON_HON = 1;
    public final int NHO_HON = -1;
    public final String STR_NHAP = "Nhap ngay thang nam";
    
    
    public int ngay;
    public int thang;
    public int nam;

    public void nhap() {
        System.out.println(STR_NHAP);
        this.ngay = new Scanner(System.in).nextInt();
        this.thang = new Scanner(System.in).nextInt();
        this.nam = new Scanner(System.in).nextInt();
    }

    public void hien() {

        System.out.println(ngay + "/" + thang + "/" + nam);
    }

    public int soSanh(ThoiGian ngs) {
        //quy uoc: bang nhau -> 0, this > ngs -> -1. this < ngs-> 1
        if (ngs != null) {

            if (this.nam != ngs.nam) {
//                if (this.nam > ngs.nam) {
//                    return -1;
//                } else {
//                    return 1;
//                }
                return this.nam > ngs.nam ? NHO_HON : LON_HON;
            }

            if (this.thang != ngs.thang) {
                return this.thang > ngs.thang ? -1 : 1;
            }
            if (this.ngay != ngs.ngay) {
                return this.ngay > ngs.ngay ? -1 : 1;

            }
            return 0;
        }

        return 1;

    }

}
