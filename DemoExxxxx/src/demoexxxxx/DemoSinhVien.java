/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoexxxxx;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class DemoSinhVien {

    public static void main(String[] args) {

        try {
            SinhVien sv = new SinhVien();
            sv.setTuoi(-3);
            return;
        } catch (TuoiException ex) {
            System.out.println("Tuoi nhap sai: " + ex.getMessage());
        } finally {
            System.out.println("kieu j cung chay");
        }
        System.out.println("du co su co hay ko van chay");
    }
}
