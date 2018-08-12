/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package democollectionapi;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Admin
 */
public class DemoMap {

    public static void main(String[] args) {

        Map<String, SinhVien> map;
        map = new HashMap<>();
        //dua du lieu vao map
        map.put("1", new SinhVien(1, "asdsd"));
        map.put("7", new SinhVien(7, "asdsd"));
        map.put("2", new SinhVien(3, " sdsa "));
        map.put("4", new SinhVien(4, "wqew w"));

        //lay ra 1 phan tu
        SinhVien get = map.get("2");
        System.out.println(get);

//        /duyet map, duyet toan bo
        Set<String> keySet = map.keySet();//lay ra danh sach key
        for (String key : keySet) {
            System.out.println(key);
            System.out.println(map.get(key));

        }
        System.out.println("%%%%%%%%%%%%%%%%%%%%%55555");
        Set<Map.Entry<String, SinhVien>> entrySet = map.entrySet();
        for (Map.Entry<String, SinhVien> entry : entrySet) {
            System.out.println(entry.getKey() + "------------" + entry.getValue());
        }

    }
}
