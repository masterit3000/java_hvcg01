/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sukien.stream;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 *
 * @author Admin
 */
public class Demo {

    public static void main(String[] args) {

        String[] ss = new String[]{"aa", "sadasd", "sdasd", "sadasd", "fgdfgfd"};

        System.out.println("foreeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
        for (String s : ss) {
            System.out.println(s);
        }
        Stream<String> stream = Arrays.stream(ss);
        System.out.println("streeeeeeeeeeeeeeeeeeeeeeeeeee");
        stream.forEach(System.out::println);
    }

}
