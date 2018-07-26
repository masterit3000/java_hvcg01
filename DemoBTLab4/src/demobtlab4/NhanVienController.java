/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demobtlab4;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class NhanVienController {

    public static final int CONGNHAN = 1;
    public static final int QUANLY = 2;
    public static final int NVVP = 3;

    public NhanVien[] nhapDanhSach() {

        System.out.println("Nhap so luong: ");
        int soLuong = new Scanner(System.in).nextInt();

        NhanVien[] nhanViens = new NhanVien[soLuong];
        for (int i = 0; i < nhanViens.length; i++) {
            System.out.println("chon : 1 Cong nhan, 2 quan lý, 3# nhan vien vp");
            int chon = new Scanner(System.in).nextInt();
            switch (chon) {
                case CONGNHAN:
                    nhanViens[i] = new CongNhan();
                case QUANLY:
                    nhanViens[i] = new QuanLy();
                    break;
                default:
                    nhanViens[i] = new NhanVienVanPhong();

            }

            nhanViens[i].nhap();
        }

        return nhanViens;

    }

    public void hien(NhanVien[] nhanViens) {

        System.out.println("tu lam ham hien");
    }

    public NhanVien[] timTheoChucVu(NhanVien[] nhanViens, int chucVu) {
        //kiem tra mng null....
//        NhanVien max = nhanViens[0];//kiem tra xcem nhanven 0 co chuc vu tuong ung hay ko
        NhanVien max = null;
        int count = 0;
        for (int i = 0; i < nhanViens.length; i++) {
            NhanVien nhanVien = nhanViens[i];
            int chucVuNV = getChucVu(nhanVien);
            if (max == null && chucVuNV == chucVu) {
                max = nhanVien;
                count++;
                continue;
            }
            if (nhanVien.getThuNhap() > max.getThuNhap() && chucVuNV == chucVu) {
                max = nhanVien;
                count++;
            }
        }

        NhanVien[] nvMax = new NhanVien[count];
        int j = 0;
        for (int i = 0; i < nhanViens.length; i++) {
            NhanVien nhanVien = nhanViens[i];
            int chucVuNV = getChucVu(nhanVien);
            if (nhanVien.getThuNhap() == max.getThuNhap() && chucVuNV == chucVu) {
                nvMax[j] = nhanVien;
                j++;
            }
        }
        return nvMax;

    }

    private int getChucVu(NhanVien nv) {

        if (nv instanceof QuanLy) {
            return QUANLY;
        }
        if (nv instanceof NhanVienVanPhong) {
            return NVVP;
        }

        return CONGNHAN;
    }
}
