/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demovo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author Admin
 */
public class DemoVo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
//        List<String> readAllLines = Files.readAllLines(Paths.get("input.txt"));
        List<String> lines = Files.readAllLines(Paths.get("input.txt"));//doc toan bo dong trong file vao list lines
        String line1 = lines.get(0);//lay ra dong 1 luu vao bien line1
        String line2 = lines.get(1);//lay ra dong 2 luu vao bien line2
        Integer n = Integer.valueOf(line1);
        System.out.println(n);//in thu ra xem dung chua
        /////////////////////////////////////////////////////////////////////////////
        //tach chuoi line2 thanh 2 mang so, toan tu
        Stack<Integer> mangSo = new Stack<>();
        Stack<Character> mangToanTu = new Stack<>();
        char[] toCharArray = line2.toCharArray();
        for (int i = 0; i < toCharArray.length; i++) {
            char c = toCharArray[i];
            if (c >= '0' && c <= '9') {//neu la so thi tao thanh chuoi s
                String s = String.valueOf(c);
                int j = i;
                while (true) {//xu ly so co 2, 3 chu so
                    if ((j + 1) < toCharArray.length && toCharArray[j + 1] >= '0' && toCharArray[j + 1] <= '9') {
                        s = s + String.valueOf(toCharArray[j + 1]);
                        j++;//tang j
                    } else {
                        break;//neu ko phai so thi thoat khoi vong lap while
                    }
                }
                mangSo.push(Integer.valueOf(s));//nhet vao mang so, 
                System.out.println("so:" + s);
                i = j;//chuyen den vi tri thu j, vi cac vi tri tiep theo cua i deu la so
                if (!mangToanTu.isEmpty() && mangToanTu.pop() == '*') {//neu gap phep nhan thuc hien luon
                    //lay 2 so hang gan nhat ra , nhan voi nhau
                    Integer pop1 = mangSo.pop();//lay so vua xong, lay xong remove khoi mang luon
                    Integer pop2 = mangSo.pop();//lay so truoc do, lay xong  remove khoi mang luon
                    Integer tinhToan = pop1 * pop2;//thuc hien nhan
                    mangSo.push(tinhToan);//nhet lai vao mang. De trong mangSo chi con cac so hang cua tong
                    System.out.println("tinh nhan :" + pop1 + " x" + pop2 + " = " + tinhToan);

                }
            } else {
                if (c == '*' || c == '+') {
                    mangToanTu.add(c);//nhet vao amng toan tu
                    System.out.println("toantu :" + c);
                }
            }

        }
        int tong = 0;
        while (!mangSo.isEmpty()) {
            tong = tong + mangSo.pop();
        }
        System.out.println("ket qua: " + tong);
        
        
        
        
        
    }

    public static Integer tinhToan(char operator, int val1, int val2) {//nhan vao 2 so va ky tu tuong ung de thuc hien phep tinh tren 2 so
        switch (operator) {
            case '-':
                return val2 - val1;
            case '+':
                return val1 + val2;
            case '*':
                return val1 * val2;
            case '/':
                return val2 / val1;
        }
        return 0;
    }

    public static int[] convertLineToNumber(String line) {

        String[] split = line.split(" ");//tach thanh mang phan tach boi ky tu space
        int[] nums = new int[split.length];//tao mang so do dai tuong ung
        for (int i = 0; i < split.length; i++) {//lap tung phan tu trong mang split
            nums[i] = Integer.valueOf(split[i]); //convert 1 ky tu sang so va gan vao phan tu nums
        }

        return nums;
    }

}
