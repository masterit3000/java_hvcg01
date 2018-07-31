/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demolamda;

/**
 *
 * @author Admin
 */
public class DemoLamda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        HocSinh hs = new HocSinh();
        HocSinh.HocSinhCapMot hscm = hs.new HocSinhCapMot();
        hs.setMa(222);
        hs.setTen("aaaa");
        hscm.inThongTin();
        
    }

}
