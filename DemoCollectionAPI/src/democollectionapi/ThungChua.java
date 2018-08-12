/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package democollectionapi;

/**
 *
 * @author Admin
 */
//public class ThungChua<T extends SinhVien> {
public class ThungChua<T> { //T dong vai tro nhu class, nhug ko biet laf class nao , de ai goi thi truuyenvao
    //mac dinh ko truyen j vao thi T la class Object

    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public static void main(String[] args) {

        ThungChua<String> tc = new ThungChua<>();
        tc.setT("fdfsfdsf");
        String t1 = tc.getT();

    }

}
