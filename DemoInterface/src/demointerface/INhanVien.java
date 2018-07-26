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
public interface INhanVien {

    void nhap();

    void hien();

    default float tinhThuNhap() {
        System.out.println("day la noi dung mac dinh cua ham nay");
        return 0;
    }

    int a = 10;
//    int b;

}
