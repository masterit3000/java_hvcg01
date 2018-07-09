/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demolab2;

/**
 *
 * @author Admin Contructor ham dc chay khi khoi tao obj NMeu minh ko viet tu
 * JAva mac dinh tehm vao class 1 contuctor rong, ko noi dung
 *
 * Tạo ra class mà chỉ tọ ra 1 obj duy nhất tu class do ( su dung
 * static,contructor 
 * Tao r class chi tao dc 3 obj tu class do, ( static,
 * contructor, mang)
 */
public class DemoContructor {

    public static void main(String[] args) {
        SanPham sp = new SanPham();
        SanPham sp1 = new SanPham(3);
        SanPham sp2 = new SanPham(2);
        SanPham sp3 = new SanPham(2, "aa", 34f);
        System.out.println(sp3.gia);
        System.out.println(sp3.ten);
        System.out.println(sp3.ma);
    }

}
