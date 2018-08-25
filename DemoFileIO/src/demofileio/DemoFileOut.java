/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demofileio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/**
 *
 * @author Admin
 */
public class DemoFileOut {
    
    public static void main(String[] args) {
        
        OutputStream os = null;
        try {
            os = new FileOutputStream("data.txt", true);
            String a = "aaaaaa";
            os.write(a.getBytes());
            
//            Collectors.toLi
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DemoFileOut.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DemoFileOut.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                os.close();
            } catch (IOException ex) {
                Logger.getLogger(DemoFileOut.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
