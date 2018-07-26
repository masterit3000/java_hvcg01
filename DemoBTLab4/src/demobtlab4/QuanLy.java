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
public class QuanLy extends NhanVien {

    private int soNhanVien;

    public QuanLy() {
    }

    public QuanLy(int soNhanVien) {
        this.soNhanVien = soNhanVien;
    }

    public QuanLy(int soNhanVien, int ma, String ten) {
        super(ma, ten);
        this.soNhanVien = soNhanVien;
    }

    public void setSoNhanVien(int soNhanVien) {
        this.soNhanVien = soNhanVien;
    }

    public int getSoNhanVien() {
        return soNhanVien;
    }

    @Override
    public float getThuNhap() {

        return 1000f;
    }

}
