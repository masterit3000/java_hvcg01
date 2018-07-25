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
public abstract class DongVat {

    public DongVat(int ma, String ten) {
        this.ma = ma;
        this.ten = ten;
    }

    private int ma;
    private String ten;

    public final int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void nhap() {
        System.out.println("nhap ma");
        System.out.println("nhap ten");
    }

    /**
     *
     */
    public abstract void hien();// ham ao, chi ten ham, tham so , ko co noi dung
//    public void hien() {// vua phai co trong dong vat , vi dv na cha phai hien thong itn
//        //va tan dung da hinh
//        // neu dong vat thi se ko hien du thong tin
//        //vi con cho thi co them mau sawc v.v.v.
//        //nen ham nay cung phai nam trong cac class con
//        System.out.println("hien ma");
//        System.out.println("hien ten");
//    }

    void abc() {
        System.out.println("hien ma");
        System.out.println("hien ten");
    }

}
