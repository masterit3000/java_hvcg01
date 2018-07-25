/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demokethua;

/**
 *
 * @author Admin contructor cua con se goi contructor cua cha, ko goi thi java
 * goi ho
 */
public class Cho extends DongVat {

    public Cho() {
        super(0, null);//goi contructor cua cha
    }

    public Cho(String mauSac, int ma, String ten) {
        super(ma, ten);
        this.mauSac = mauSac;
    }

    private String mauSac;

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    @Override
    public void nhap() {
        super.nhap();//goi ham nhap cua class Cha
        System.out.println("nhap mau sac");
    }

    /**
     *
     */
    @Override
    public void hien() {//tuyet, cha co, con co, dam bao chay dung, dan bam dung dc tinh da dhinh
//        super.hien(); //To change body of generated methods, choose Tools | Templates.

        System.out.println("hien ma");
        System.out.println("hien ten");
        System.out.println("hien mau sac");
    }

    @Override
    void abc() {
        super.abc(); //To change body of generated methods, choose Tools | Templates.
    }

}
