/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demobtlab4;

/**
 *
 * @author Admin
 */
public abstract class NhanVien {

    private int ma;
    private String ten;

    private float luong;

    public abstract float getThuNhap();

    public int getMa() {
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

    public NhanVien() {
    }

    public NhanVien(int ma, String ten) {
        this.ma = ma;
        this.ten = ten;
    }

    public void setLuong(float luong) {
        this.luong = luong;
    }

    public float getLuong() {
        return luong;
    }

    public void nhap() {
        System.out.println("nhap nhan vien@ ten, luong");
    }

    public void hien() {
        System.out.println("hien... nhan vien");
    }
}
