/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pathhhh;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class DemoNIO {

    public static void main(String[] args) {
        try {
            Path path = Paths.get("data.txt");
            Path path2 = Paths.get("data2.txt");
            Files.copy(path, path2, StandardCopyOption.REPLACE_EXISTING);
//            Files.find(path, 0, matcher, options)
            List<String> readAllLines = Files.readAllLines(path);
            for (String readAllLine : readAllLines) {
                System.out.println(readAllLine);
            }
//            Files.w
        } catch (IOException ex) {
            Logger.getLogger(DemoNIO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
