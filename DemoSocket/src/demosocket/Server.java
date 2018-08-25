/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demosocket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class Server {

    /**
     * @param args the command line arguments
     * viet server co the ket noi tu nhieu client
     * Va moi lan client nao ket noi toi thi tra ve cho client do 1 file ( ảnh), client nhan data và lư trữ lại
     * 
     * 
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            ServerSocket serverSocket = new ServerSocket(4567);
            System.out.println("Dang cho client");
            Socket socket = serverSocket.accept(); //lenh nay la de server cho client ket noi toi
            //net clietn ket noi thanh cong thi se chay tiep và tra ve 1 obj socket
            System.out.println("Client ket noi thanh cong");
            System.out.println("Client ket noi thanh cong: " + socket.getPort());
            System.out.println("Client ket noi thanh cong: " + socket.getInetAddress().getHostAddress());
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true) {
                        try {
                            String s = new Scanner(System.in).nextLine();
                            writer.write(s);
                            writer.newLine();
                            writer.flush();
                        } catch (IOException ex) {
                            ex.printStackTrace();
                            break;
                        }
                    }
                }
            });
            thread.start();

            while (true) {
                String readLine = reader.readLine();
                if (readLine == null) {
                    break;
                }
                System.out.println("Client: " + readLine);
            }
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
