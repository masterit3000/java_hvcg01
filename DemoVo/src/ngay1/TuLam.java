/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ngay1;

import java.util.Scanner;
import jdk.nashorn.internal.parser.TokenType;

/**
 *
 * @author Admin
 */
public class TuLam {

    public static void main(String[] args) {
        int a;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        /*   if (a%2==0) {
            
            System.out.println("a la so chan");
            
        }else {
            
            System.out.println("a la so le");
        }*/
        // nhap vao bien a, in ra tong cac so chan  nho6 hon a tru so 4, 
        for (int i = 0; i <= a; i++) {
            if (i == 4) {
                continue;
            }
            if (i % 2 == 0) {
                sum = sum + i;
            }

        }
        System.out.println("tong cac so chan nho hon " + a + " la " + sum);
    }
}
