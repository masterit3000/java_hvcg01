/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demofileio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class DemoFileWriter {
    
    public static void main(String[] args) {
        
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter("data.txt"));
            String s ="aa";
            writer.write("sadsadasd");
            writer.newLine();
            writer.write("bbbbbbbbbbbbbbb");
            writer.newLine();
            writer.write("nnnnnnnnnnnn");
            writer.newLine();
            writer.write("sadsadasd");
        } catch (IOException ex) {
            Logger.getLogger(DemoFileWriter.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                writer.close();
            } catch (IOException ex) {
                Logger.getLogger(DemoFileWriter.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
