/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demolab3;

/**
 *
 * @author Admin
 */
public class SinhVien {

//    public int ma;//cho nao cung thay
//    protected String ten;//chi cung pk
//    private int tuoi;//chi trong class
//    String diachi;//giong protected
    private int ma;
    private int tuoi;
    private String ten;

    public SinhVien() {
    }
    public SinhVien(int ma) {
        this.ma = ma;
    }
 

    public SinhVien(int ma, int tuoi, String ten) {
        this.ma = ma;
        this.tuoi = tuoi;
        this.ten = ten;
    }
    public SinhVien(int ma, int tuoi, String ten, int a) {
        this.ma = ma;
        this.tuoi = tuoi;
        this.ten = ten;
    }
    public SinhVien(int ma, int tuoi) {
        this.ma = ma;
        this.tuoi = tuoi;
    }
//       public SinhVien(int ma, int ma1) {
//        this.ma = ma;
//        this.ma = ma1;
//    }
    
    

    public void setMa(int ma) {
        this.ma = ma;
    }

    public int getMa() {
        return ma;
    }



    public String getName() {//co thuoc tinh name, chi doc, vi ko co ham setName
        return ten;
    }

    public void setTen(String ten) {//co thuoc tinh ten, chi ghi, vi ko co ham getTen
        this.ten = ten;
    }

    public void setTuoi(int tuoi) {
        if (tuoi > 0 && tuoi < 100) {
            this.tuoi = tuoi;
        } else {

            System.out.println("Tuoi phai > 0 va < 100");
        }
    }

    public int getTuoi() {
        return tuoi;
    }
    
    public static void main(String[] args) {
        
        SinhVien sv = new SinhVien(1);
    }

}
