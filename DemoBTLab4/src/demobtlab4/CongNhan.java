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
public class CongNhan extends NhanVien {

    private int soNgayLamViec;

    public CongNhan() {
    }

    public CongNhan(int soNgayLamViec) {
        this.soNgayLamViec = soNgayLamViec;
    }

    public void setSoNgayLamViec(int soNgayLamViec) {
        this.soNgayLamViec = soNgayLamViec;
    }

    public int getSoNgayLamViec() {
        return soNgayLamViec;
    }

    @Override
    public float getThuNhap() {

        return getLuong() * (soNgayLamViec / 30);
    }

}
