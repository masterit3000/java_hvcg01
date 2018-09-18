/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demojdbcmvc.ctrl.dto;

import demojdbcmvc.model.entity.*;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class SinhVienDTO {

    private int ma;
    private String ten;
    private String ngaysinh;
    private int lop;

    public SinhVienDTO() {
    }

    public SinhVienDTO(int ma, String ten, String ngaysinh, int lop) {
        this.ma = ma;
        this.ten = ten;
        this.ngaysinh = ngaysinh;
        this.lop = lop;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public int getLop() {
        return lop;
    }

    public void setLop(int lop) {
        this.lop = lop;
    }

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

}
