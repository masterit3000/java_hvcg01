/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package democollectionapi;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author Admin
 */
public class DemoCollectionAPIGeneric {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("vvc");
        list.add("sdfsdfs");
        list.add("dfdsfs");
        list.add("444");
        
        for (int i = 0; i < list.size(); i++) {
            String get = list.get(i);
            System.out.println(get);
        }
        System.out.println("__________________________-");
        for (String object : list) {
            System.out.println(object);
        }
        System.out.println("__________________________-");
        list.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String t) {

                System.out.println(t);
            }
        });

    }

}
