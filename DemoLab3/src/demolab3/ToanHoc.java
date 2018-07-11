/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demolab3;

/**
 *
 * @author Admin
 */
public class ToanHoc {

    public int tinhTong(int a, int b) {

        return a + b;
    }
//    public int tinhTong(int b, int aa) {
//
//        return a + b;
//    }

    public int tinhTong(int a, int b, int c) {

        return a + b + c;
    }

    public int tinhTong(int... a) {//ham co tham so kha bien. Thich truyen vao bao nhieu bien nguyen deu dc
        //java se coi a la mang cac so nguyen
        int tong = 0;
        for (int i = 0; i < a.length; i++) {
            tong += a[i];
        }
        return tong;
    }

    public int tinhTong(int a, float b) {

        return (int) (a + b);
    }

    public int tinhTong(float a, int b) {

        return (int) (a + b);
    }

    public static void main(String[] args) {

        ToanHoc th = new ToanHoc();
        th.tinhTong(0, 0);
        th.tinhTong(0, 0);
        th.tinhTong(0, 4, 5);
        th.tinhTong(0, 4f);
        th.tinhTong(2, 4, 5, 6, 5);
        int tinhTong = th.tinhTong(2, 4, 5, 6, 5, 7, 8, 7, 4, 4, 5, 6, 8, 3, 356, 4, 64, 456, 45645, 7457, 5675, 8);
        System.out.println(tinhTong);
        String ten = "Nguyen van a";
        int tuoi = 30;
        System.out.printf("Toi ten la: %s, nam nay toi %d tuoi", ten, tuoi);
    }
}
