/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demointerface;

/**
 *
 * @author Admin
 */
public interface INhanVienCtrl {

    INhanVien[] taoDanhSach();

    void hienDanhSach(INhanVien[] ds);

    INhanVien[] timMaxTheoChucVu(INhanVien[] ds, int chucvu);

}
