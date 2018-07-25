/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demokethua;

/**
 *
 * @author Admin
 */
public class QuanLyConVat {

    public void nhap(DongVat[] ds) {

        if (ds != null) {
            for (int i = 0; i < ds.length; i++) {
                if (ds[i] != null) {
                    ds[i].nhap();
                }
            }
        }
    }
    public void hien(DongVat[] ds) {
        if (ds != null) {
            for (int i = 0; i < ds.length; i++) {
                if (ds[i] != null) {
                    ds[i].hien();
                }
            }
        }
    }

}
