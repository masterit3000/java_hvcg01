/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demodaluong;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class DemoDaLuong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyThread myThread = new MyThread();
        myThread.start();//chuong trình se tao ra 1 thread #main sau do goi ham run chay trong thread do

        Thread threadC = new Thread(new MyRunner());
        threadC.start();

        Thread threadA = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                try {
                    System.out.println("a");
                    Thread.sleep(30);
                } catch (InterruptedException ex) {
                    Logger.getLogger(DemoDaLuong.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        threadA.start();
        threadA.setPriority(10);

        try {
            threadA.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(DemoDaLuong.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (int i = 0; i < 100; i++) {
            System.out.println("hhhhhhhhhhhhhhhhh");
        }

    }

}
