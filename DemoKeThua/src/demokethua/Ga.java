/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demokethua;

/**
 *
 * @author Admin
 */
public final class Ga extends DongVat {

    public Ga() {
        super(0, null);
    }

    private float canNang;

    public float getCanNang() {
        return canNang;
    }

    public void setCanNang(float canNang) {
        this.canNang = canNang;
    }

    @Override
    public void hien() {
        System.out.println("bat phai  cai ham nay, nen cai bua vao");
    }

}
