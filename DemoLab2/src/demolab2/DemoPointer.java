/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demolab2;

/**
 *
 * @author Admin
 */
public class DemoPointer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        SanPham sp1 = new SanPham();
        sp1.ma = 1;
        sp1.ten = "Chuot ";
        sp1.gia = 20.0f;
        SanPham sp2 = sp1;

        System.out.println("sp2.ma=" + sp2.ma);//vi gan sp2 = sp1 nen sp2.ma = 1
        System.out.println("sp2.ten=" + sp2.ten);//sp2.ten = chuot
        System.out.println("sp2.gia=" + sp2.gia);// = 20

        sp1.gia = 30f;//
        System.out.println("sp1.gia=" + sp1.gia);//in ra 30
        System.out.println("sp2.gia=" + sp2.gia);//in ra  30

        giamGia(sp1.gia);
        System.out.println("sp1.gia=" + sp1.gia);//in ra 30
        giamGia(sp1);
        System.out.println("sp1.gia=" + sp1.gia);//in ra 20
    }

    public static void giamGia(float gia) {// tham trị -> truyef giá trị cho tham sô
        gia = gia - 10;
    }

    public static void giamGia(SanPham sp) {//tham chieu, -> truyen vao dia chi cua bien( obj) cho tham so
        sp.gia = sp.gia - 10;
    }

}
