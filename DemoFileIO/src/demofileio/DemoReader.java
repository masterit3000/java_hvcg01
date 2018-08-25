/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demofileio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class DemoReader {

    public static void main(String[] args) {

        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(new FileInputStream("data.txt")));
//            reader = new BufferedReader(new InputStreamReader(System.in));
            String s = "aaaaaaaaaaaa";
            while (true) {
                String readLine = reader.readLine();
                if (readLine == null) {
                    break;
                }
                System.out.println(readLine);

            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DemoReader.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DemoReader.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                reader.close();
            } catch (IOException ex) {
                Logger.getLogger(DemoReader.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
