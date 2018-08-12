/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package democollectionapi;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Admin
 */
public class DemoLinked {

    public static void main(String[] args) {

        LinkedList<SinhVien> list = new LinkedList<>();

        list.add(new SinhVien(1, "sdasasdasd"));
        list.add(new SinhVien(5, "sdasasdasd"));
        list.add(new SinhVien(3, "sdasasdasd"));
        list.add(new SinhVien(2, "vvvvv"));
        list.add(new SinhVien(9, "sdasasdasd"));

        System.out.println(list.pop());
        System.out.println(list.pop());
        System.out.println(list.pop());

    }

}
