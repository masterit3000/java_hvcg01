/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class SinhVien {

    private int ma;
    private String ten;
    private Date ngaysinh;

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

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public SinhVien() {
    }

    public SinhVien(int ma, String ten, Date ngaysinh) {
        this.ma = ma;
        this.ten = ten;
        this.ngaysinh = ngaysinh;
    }

}
