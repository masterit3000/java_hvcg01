/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demolamda;

/**
 *
 * @author Admin
 */
public class HocSinh {

    private int ma;
    private String ten;

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public HocSinh() {
    }

    public HocSinh(int ma, String ten) {
        this.ma = ma;
        this.ten = ten;
        HocSinhCapMot hscm = new HocSinhCapMot();
        hscm.setCanNang(34f);
        hscm.setCanNang(165f);

    }

    class HocSinhCapMot {

        private float chieuCao;
        private float canNang;

        public void inThongTin() {

            System.out.println("ma hs " + ma);//dung luon bien cua class bao ben ngoai
            System.out.println("ten hs " + ten);
            System.out.println("can nang" + this.canNang);
        }

        public float getChieuCao() {
            return chieuCao;
        }

        public void setChieuCao(float chieuCao) {
            this.chieuCao = chieuCao;
        }

        public float getCanNang() {
            return canNang;
        }

        public void setCanNang(float canNang) {
            this.canNang = canNang;
        }

    }

}
