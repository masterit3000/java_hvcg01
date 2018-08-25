/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demofileio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class DemoObjectIO {

    public static void main(String[] args) {

        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("sv.dat"));
            Sinhvien sv = null;
            Object readObject = ois.readObject();
            if (readObject instanceof Sinhvien) {
                sv = (Sinhvien) readObject;
                System.out.println(sv.getMa());
                System.out.println(sv.getTen());
            }
        } catch (IOException ex) {
            Logger.getLogger(DemoObjectIO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DemoObjectIO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ois.close();
            } catch (IOException ex) {
                Logger.getLogger(DemoObjectIO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void main1(String[] args) {

        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("sv.dat"));
            Sinhvien sv = new Sinhvien();
            sv.setMa(222);
            sv.setTen("aaaaaaaaa");
            oos.writeObject(sv);
            System.out.println("ok ok");
        } catch (IOException ex) {
            Logger.getLogger(DemoObjectIO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                oos.close();
            } catch (IOException ex) {
                Logger.getLogger(DemoObjectIO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}
