/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hvcg_javacore_01;

/**
 *
 * @author Admin\
 * Viets class 
 * khach hang: ma, ten, ngay sinh
 * Ngay Sinh la 1 obj cua class ThoiGian ( ngay , thang, nam)
 * Nhap tu ban phim 2 khach hang, tim xem  khach hang nao tuoi lon hon
 * Nhap tu ban phim bang Scanner.. gooogle tim hieu cach su dung
 * 
 * 
 */
public class HVCG_JavaCore_01 {

    /**
     * @param args the command line arguments uy uoc dat ten bein ten class
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //noi bat dau chay chuong trinh

        KhachHang kh1;//khai bao 1 obj co ten la kh1, thoc kieu khachhang
        //chi khai bao thi ko dung dc, phai khoi tao
        kh1 = new KhachHang();//khoi tao 1 obj khach hang

        KhachHang kh2 = new KhachHang();//vua khai bao vua khoi tao
        kh1.ma = 1;
        kh1.name = "Ngueyn Van A";
        kh1.diaChi = "Ha Noi";
//        kh1.soDienThoai = "Ha Noi";
        kh1.inThongTin();

    }

}
