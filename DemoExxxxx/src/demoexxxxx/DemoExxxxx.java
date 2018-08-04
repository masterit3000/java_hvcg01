/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoexxxxx;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class DemoExxxxx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            //hay co thuc hien doan code nauy cho toi
            //neu cos su co xay ra thi nhay vao catch chay, dung moi xu ly tiep theo
            System.out.println("nhap 2 so");
            int a = new Scanner(System.in).nextInt();
            int b = new Scanner(System.in).nextInt();
            //vi du: ko dc chia cho 1
            if (b == 1) {
                //tao ra su co va goi catch chay
//                Exception e = new Exception("Su co chia cho 1");
                throw new ChiaChoMotException();//lenh coi catch chay
            }
            int c = a / b;
            c = a + b / (b - a) + b / (a - c);
            System.out.println("c = " + c);
        } catch (ArithmeticException e) {
            //neu co su co xay ra thi vao day chay
            System.out.println("co su co xay ra:" + e.getMessage());
//            e.printStackTrace();
        } catch (InputMismatchException e) {
            System.out.println("su co nhap du lieu ko dung");
        } catch (ChiaChoMotException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("gap su co j do: " + e.getMessage());
        }

    }

}
