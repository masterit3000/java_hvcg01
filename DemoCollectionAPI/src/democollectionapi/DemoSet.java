/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package democollectionapi;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;

/**
 *
 * @author Admin
 */
public class DemoSet {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        set.add("aaaaaaa");
        set.add("aaaaaaa");
        set.add("aaa5aaaa");
        set.add("aaaa5aaa");
        set.add("aaaa455aaa");
        set.add("aaaaaaa");
        set.add("aaaaaaa");

        for (String string : set) {
            System.out.println(string);
        }
        set.forEach(new Consumer<String>() {
            @Override
            public void accept(String t) {
                System.out.println(t);
            }
        });
        Set<SinhVien> sv = new TreeSet<>();
        sv.add(new SinhVien(1, "aaaaaaa"));
        sv.add(new SinhVien(4, "4444444444"));
        sv.add(new SinhVien(15, "555555"));
        sv.add(new SinhVien(11, "11111111"));
        sv.add(new SinhVien(19, "999999999"));
        
        for (SinhVien sinhVien : sv) {
            System.out.println(sinhVien);
        }
         
        
        Iterator<SinhVien> it = sv.iterator();//it tro den tung phan tu cuar set/list
        while (it.hasNext()) {
            SinhVien next = it.next();
            System.out.println(next);
        }
    }
}
