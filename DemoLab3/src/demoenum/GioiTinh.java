/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoenum;

/**
 *
 * @author Admin chi co 3 obj
 */
public enum GioiTinh {//la 1 class nhung co dinh so luong obj cua no

    NAM("Con trai"), NU("Con gai"), KXD();
    //cac obj dc khai bao , class nay chi dc su dung cac obj nay thoi

    private GioiTinh(String tenTV) {
        System.out.println("dang tao obj gioi tinh: " + tenTV);
        this.tenTV = tenTV;
    }

    private GioiTinh() {
        System.out.println("dang tao obj gioi tinh");
    }

    private String tenTV;

    public String getTenTV() {
        return tenTV;
    }

    public void setTenTV(String tenTV) {
        this.tenTV = tenTV;
    }

}
