/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demokethua;

import newpackage.Vit;

/**
 *
 * @author Admin
 */
public class DemoKeThua {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Cho cho1 = new Cho();
        cho1.setMa(1);
        cho1.setMauSac("Den");
        cho1.nhap();
        
        System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaa");
        DongVat dv1 = new Cho();//cho phep, vi cho thi cung la dong vat, nen dv1 dc phep tro toi
        dv1.nhap();
        Cho ch2 = (Cho) dv1;//ko phari luc nao cung ep dc kieu ntn, vi ban chat dv1 la Cho -> moi ep kieu dc

        dv1 = new Ga();
        dv1 = new Vit();
        System.out.println("***************************");
        Cho[] chos = new Cho[2];
        chos[0] = new Cho("Den", 11, "aaa");
        chos[1] = new Cho("Den", 12, "bbb");
        QuanLyConVat qlcv = new QuanLyConVat();
        qlcv.nhap(chos);
        
        Vit[] vits = new Vit[4];
        qlcv.nhap(vits);
        System.out.println("**********************");
        Ga ga = new Ga();
        ga.hien();// chi hein cua dongvat, lam tuong day la dv ko phai con ga

//        DongVat dv = new DongVat();?? abtrac class ko dc tao obj
    }
    
}
