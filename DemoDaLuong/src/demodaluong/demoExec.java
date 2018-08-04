/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demodaluong;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class demoExec {

    public static void main(String[] args) {

        ExecutorService exsv = Executors.newFixedThreadPool(2);
        exsv.submit(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    try {
                        System.out.println("aaaaaaaaaaaaaaaaaa");
                        Thread.sleep(33);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(demoExec.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
        exsv.submit(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    try {
                        System.out.println("bbbbbbbbbbbbbbbbbbbbbbbbb");
                        Thread.sleep(3);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(demoExec.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
        exsv.submit(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    try {
                        System.out.println("cccccccccccccccccccccccccc");
                        Thread.sleep(33);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(demoExec.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
        Future<String> tuogLai = exsv.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                //nhu ham run
                for (int i = 0; i < 100; i++) {
                    System.out.println("dddddddd");
                    Thread.sleep(33);
                }
                return "D Xong roi";
            }

        });
        try {
            String get = tuogLai.get();//thi ham main se cho thread tra ve tuong lai chay xong thi moi chay tiep
            //va nhan ve kêt qua
            System.out.println("ket quá: " + get);
        } catch (InterruptedException ex) {
            Logger.getLogger(demoExec.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ExecutionException ex) {
            Logger.getLogger(demoExec.class.getName()).log(Level.SEVERE, null, ex);
        }
        exsv.shutdown();
    }
}
