/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ngay1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class DemoScanner {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("input.txt"));
//        Scanner scanner = new Scanner(System.in);
        int nextInt = scanner.nextInt();///dung lai cho nhap so nguyen moi chay tiep
        System.out.println(nextInt);
        
    }

}
