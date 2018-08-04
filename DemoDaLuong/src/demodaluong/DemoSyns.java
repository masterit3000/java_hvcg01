/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demodaluong;

import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 * BTVN : Tao ra chuong trinh co 3 thread:
 * Thead A in ra so A ngau nhien
 * Thread B in ra so B ngau nhien
 * Thread C tinh tong 2 so A, B
 */
public class DemoSyns {

    static Data data = new Data();

    public static void main(String[] args) {
        Thread threadChan = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (data) {
                    for (int i = 0; i < 100;) {
                        try {
                            if (data.laCo == 0) {
                                data.a = i;
                                System.out.println("chan thu  " + i + " = " + data.a);
                                Thread.sleep(33);
                                i += 2;
                                //lam xong viec
                                data.laCo = 1;
                                data.notifyAll();//danh thuc cac thread dang bi data cho wait thuc day
                            } else {
                                data.wait();
                            }
                        } catch (InterruptedException ex) {
                            Logger.getLogger(DemoSyns.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
//                    data.laCo = 1;
//                    data.notifyAll();//danh thuc cac thread dang bi data cho wait thuc day
                }
            }
        });
        Thread threadLe = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (data) {
                    for (int i = 1; i < 100;) {
                        try {
                            if (data.laCo == 1) {
                                data.a = i;
                                System.out.println("le thu  " + i + " = " + data.a);
                                Thread.sleep(33);
                                i += 2;
                                //lamf xong 
                                data.laCo = 0;
                                data.notifyAll();//goi de threadChan thuc day

                            } else {
                                data.wait();
                            }
                        } catch (InterruptedException ex) {
                            Logger.getLogger(DemoSyns.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            }
        });
        threadChan.start();
        threadLe.start();
//        dealock
        StringBuilder builder = new StringBuilder("aaaa");
        builder.append("bbb").append("vvvv");
        System.out.println(builder.toString());
//        MessageFormat format = new MessageFormat("Xin chao: %s");
//        String format1 = format.format("aaaa");
//        System.out.println(format1);
    }

}

class Data {

    public int a;
    public int laCo = 0;//co - 0  chan chay, = 1 le chay

}
