/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoenum;

/**
 *
 * @author Admin
 */
public class KhachHang {
    
    public static final int NAM = 1;
    public static final int NU = 0;
    public static final int KXD = -1;
    private int gioiTinh;//liet ke

    private GioiTinh gt;
    
    public void setGt(GioiTinh gt) {
        this.gt = gt;
    }
    
    public GioiTinh getGt() {
        return gt;
    }
    
    public int getGioiTinh() {
        return gioiTinh;
    }
    
    public String getGioiTinhString() {
        switch (this.gioiTinh) {
            case NAM:
                return "Con Trai";
            case NU:
                return "Con gai";
            default:
                return "KXD";
            
        }
    }
    
    public void setGioiTinh(int gioiTinh) {
        if (gioiTinh == NAM || gioiTinh == NU || gioiTinh == KXD) {
            this.gioiTinh = gioiTinh;
        }
    }
    
    public static void main(String[] args) {
        
        KhachHang kh = new KhachHang();
        kh.setGt(GioiTinh.NU);
        System.out.println(kh.getGt().getTenTV());//con gai do set trong class GioiTinh
        kh.getGt().setTenTV("Phu Nu");
        System.out.println(kh.getGt().getTenTV());//rta  phu nu do set o tren
        KhachHang kh2 = new KhachHang();
        kh2.setGt(GioiTinh.NU);
        System.out.println(kh2.getGt().getTenTV());//ra phu nu, vi cung pbj GioiTinh-Nu o tren

    }
    
}
