/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vidusukien.anchuot.laptrinhvienlamgiaodien;

import vidusukien.anchuot.ClassXuLyAnChuot;
import vidusukien.anchuot.ISuKienAnChuot;

/**
 *
 * @author Admin
 */
public class GiaoDien {

    public static void main(String[] args) {

        ClassXuLyAnChuot anChuot = new ClassXuLyAnChuot();
        ISuKienAnChuot anChuotVaoNutLogin = new SuKienAnChuotVaoNutLogin();
        anChuot.setSuKienAnChuot(anChuotVaoNutLogin);
        anChuot.anChuot();//khi an hcuot thi ham 
        //dua vao noi sung xu ly an chuot do minh viet

    }

}
