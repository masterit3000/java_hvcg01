/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sukien;

/**
 *
 * @author Admin
 */
public class XuLySuKienAnNut implements ISuKienAnNut {

    private String ten;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    @Override
    public void nutBiAn(String suKien) {
        System.out.println("dang an nut: " + suKien + " ten nut la: " + ten);
    }

}
