/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theodoi;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;

import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class DemoTracking {

    public static void main(String[] args) {

        try {
            WatchService newWatchService = FileSystems.getDefault().newWatchService();
            Path path = Paths.get("D:");
            WatchKey register = path.register(newWatchService, StandardWatchEventKinds.ENTRY_CREATE);
            while (true) {
                System.out.println("dang theo doi....");
                newWatchService.take();
                List<WatchEvent<?>> pollEvents = register.pollEvents();
                for (WatchEvent<?> pollEvent : pollEvents) {
                    System.out.println(pollEvent.context());  
                }

            }
        } catch (IOException ex) {
            Logger.getLogger(DemoTracking.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(DemoTracking.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
