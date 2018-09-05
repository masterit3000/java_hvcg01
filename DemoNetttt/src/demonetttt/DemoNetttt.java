/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demonetttt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class DemoNetttt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            InetAddress address = InetAddress.getLocalHost();
            System.out.println(address.getHostAddress());
            System.out.println(address.getHostName());
            
            URL url = new URL("https://dantri.com.vn/");
            URLConnection openConnection = url.openConnection();
//            openConnection.addRequestProperty("cokkie", "");
            openConnection.connect();
            InputStream inputStream = openConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Charset.forName("utf-8")));
            while (true) {
                String readLine = bufferedReader.readLine();
                System.out.println(readLine);
                if (readLine == null) {
                    break;
                }
            }
            
            
            
        } catch (UnknownHostException ex) {
            Logger.getLogger(DemoNetttt.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(DemoNetttt.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DemoNetttt.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
