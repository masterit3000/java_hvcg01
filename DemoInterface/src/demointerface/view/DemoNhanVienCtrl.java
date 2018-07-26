/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demointerface.view;

import demointerface.INhanVien;
import demointerface.INhanVienCtrl;

/**
 *
 * @author Admin
 */
public class DemoNhanVienCtrl implements INhanVienCtrl {

    @Override
    public INhanVien[] taoDanhSach() {
        System.out.println(" tao ds ");
        return null;
    }

    @Override
    public void hienDanhSach(INhanVien[] ds) {
        System.out.println("hiennnn");
    }

    @Override
    public INhanVien[] timMaxTheoChucVu(INhanVien[] ds, int chucvu) {
        System.out.println("tim maxxx");
        return null;
    }

}
