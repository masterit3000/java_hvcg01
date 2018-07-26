/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vidusukien.anchuot;

/**
 *
 * @author Admin
 */
public class ClassXuLyAnChuot {

    private ISuKienAnChuot suKienAnChuot;

    public ISuKienAnChuot getSuKienAnChuot() {
        return suKienAnChuot;
    }

    public void setSuKienAnChuot(ISuKienAnChuot suKienAnChuot) {
        this.suKienAnChuot = suKienAnChuot;
    }

    public void anChuot() {

        suKienAnChuot.click();
        System.out.println("an chuot thi lam j do");
    }
;
}
