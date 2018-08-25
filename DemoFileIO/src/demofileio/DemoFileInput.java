/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demofileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class DemoFileInput {

    public static void main(String[] args) {

        InputStream is = null;
        byte[] data;
        try {
            is = new FileInputStream("data.txt");
            
            data = new byte[is.available()];
            is.read(data);
            
            while (true) {
                char read = (char) is.read();
//            if (read == -1) {
                if (is.available() == 0) {
                    break;
                }
//xu ly
                System.out.println(read);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DemoFileInput.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DemoFileInput.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                is.close();
            } catch (IOException ex) {
                Logger.getLogger(DemoFileInput.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
