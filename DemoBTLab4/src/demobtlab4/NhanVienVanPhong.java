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
public class NhanVienVanPhong extends NhanVien {

    private float heSo;

    public void setHeSo(float heSo) {
        this.heSo = heSo;
    }

    public float getHeSo() {
        return heSo;
    }

    public NhanVienVanPhong() {
    }

    public NhanVienVanPhong(float heSo) {
        this.heSo = heSo;
    }

    @Override
    public float getThuNhap() {
        return getLuong() + getLuong() * heSo;
    }

}
