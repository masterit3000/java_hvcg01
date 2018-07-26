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
public class NhanVienXXX  implements  INhanVien, INhanVienCtrl{

    @Override
    public void nhap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void hien() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float tinhThuNhap() {
        return INhanVien.super.tinhThuNhap(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public INhanVien[] taoDanhSach() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void hienDanhSach(INhanVien[] ds) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public INhanVien[] timMaxTheoChucVu(INhanVien[] ds, int chucvu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
