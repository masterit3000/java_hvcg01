/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demojpa01;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Admin XML
 */
@Entity
@Table(name = "sinhvien")
public class SinhVien {

    @Id
    @Column(name = "ma")
    private int ma;

    @Column
    private String ten;
    
    @Column(name = "ngaysinh")
    private Date ngaySinh;

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

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public SinhVien() {
    }

    public SinhVien(int ma, String ten, Date ngaySinh) {
        this.ma = ma;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
    }

}
