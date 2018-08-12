/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package democollectionapi.collections;

import democollectionapi.SinhVien;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Admin
 */
public class DemoTimKiemSapXep {

    public static void main(String[] args) {

        List<SinhVien> list = new ArrayList<>();
        list.add(new SinhVien(15, "555555"));
        list.add(new SinhVien(1, "aaaaaaa"));
        list.add(new SinhVien(4, "4444444444"));
        list.add(new SinhVien(11, "11111111"));
        list.add(new SinhVien(19, "999999999"));

        Collections.sort(list, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.getTen().compareTo(o2.getTen());
            }
        });

        for (SinhVien sinhVien : list) {
            System.out.println(sinhVien);
        }

        SinhVien max = Collections.max(list, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.getTen().compareTo(o2.getTen());
            }
        });

        System.out.println("max: " + max);
        int binarySearch = Collections.binarySearch(list, new SinhVien(1, "aaaaaaa"), new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.getTen().compareTo(o2.getTen());
            }
        });
        
        
        SinhVien ketQua = list.get(binarySearch);
        System.out.println("ket qua: " + ketQua);
        

    }
}
