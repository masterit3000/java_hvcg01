/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demonetttt;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class DemoDowwnload {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            InetAddress address = InetAddress.getLocalHost();
            System.out.println(address.getHostAddress());
            System.out.println(address.getHostName());

            URL url = new URL("https://dantricdn.com/thumb_w/640/2018/9/5/le-minh-tri-2-1536134691870532881063.jpg");
            URLConnection openConnection = url.openConnection();
//            openConnection.
            openConnection.addRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Safari/537.36");
            openConnection.connect();
            InputStream inputStream = openConnection.getInputStream();
//            Path path = Paths.get("abc.jpg");
//            byte[] bytes = new byte[inputStream.available()];
//            inputStream.read(bytes);
//            Files.write(path, bytes, StandardOpenOption.CREATE_NEW);
            FileOutputStream fos = new FileOutputStream("aaa.jpg");
            while (true) {
                int read = inputStream.read();
                if (read == -1) {
                    break;
                }
                fos.write(read);
            }
            fos.close();

        } catch (UnknownHostException ex) {
            Logger.getLogger(DemoDowwnload.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(DemoDowwnload.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DemoDowwnload.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
