/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileeeeeeeeee;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class DemoFile {

    public static void main(String[] args) {
        File file = new File("D:");
        System.out.println(file.isDirectory());
//        System.out.println(file.mkdir());
        File[] listFiles = file.listFiles();
        for (File listFile : listFiles) {
            System.out.println(listFile.getName());
        }
        
        File[] listRoots = File.listRoots();
        System.out.println("rrrrrrrrrrrrrrr");
        for (File listRoot : listRoots) {
            System.out.println(listRoot.getAbsolutePath());
        }
        
        
        

    }
}
