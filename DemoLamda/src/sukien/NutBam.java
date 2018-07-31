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
public class NutBam {

    private ISuKienAnNut iSuKienAnNut;

    public void anNut(String s) {
        //hamnay se dc he thong goi khi co nguoi dung an nut
        iSuKienAnNut.nutBiAn(s);
    }

    public ISuKienAnNut getiSuKienAnNut() {
        return iSuKienAnNut;
    }

    public void setiSuKienAnNut(ISuKienAnNut iSuKienAnNut) {
        this.iSuKienAnNut = iSuKienAnNut;
    }

}
