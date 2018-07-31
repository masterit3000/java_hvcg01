/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sukien;

/**
 *
 * @author Admin
 */
public class GiaoDien {

    private NutBam bam = new NutBam();
    private String tenNut = "Nut login";

    public GiaoDien() {
//        XuLySuKienAnNut suKienAnNut = new XuLySuKienAnNut();
//        suKienAnNut.setTen(tenNut);

//        bam.setiSuKienAnNut(new XuLyAnNutInner());
        bam.setiSuKienAnNut(new ISuKienAnNut() {
            @Override
            public void nutBiAn(String suKien) {
                System.out.println("vo danh an nut:" + tenNut + ". Su kien: " + suKien);
            }
        });

        bam.setiSuKienAnNut((String suKien) -> {
            System.out.println("vo danh an nut:" + tenNut + ". Su kien: " + suKien);
        });
//        bam.setiSuKienAnNut((suKien) -> System.out.println("vo danh an nut:" + tenNut + ". Su kien: " + suKien));
        bam.setiSuKienAnNut((suKien) -> {
            System.out.println(suKien);
        });
//        bam.setiSuKienAnNut(System.out::println);
//        bam.setiSuKienAnNut((sk) -> xulyAnNut(sk));
        bam.setiSuKienAnNut(this::xulyAnNut);

    }

    public void xulyAnNut(String suKien) {
        System.out.println("demo function ref an nut: " + suKien);
        System.out.println("ten nut: " + tenNut);
    }

    public void demoNguoiDungAnNut() {

        bam.anNut("demo nut 01 bị an");
    }

    class XuLyAnNutInner implements ISuKienAnNut {

        @Override
        public void nutBiAn(String suKien) {
            System.out.println("Dang an nut: " + tenNut + ". Su kien: " + suKien);
        }

    }

}
