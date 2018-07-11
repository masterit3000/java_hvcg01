/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demobaitaplab2;

/**
 *
 * @author Admin
 */
public class Pool {

    public boolean trangThai;
    //false: dng ban
    //true : ranh
    private static Pool[] pools = new Pool[3];

    private Pool() {
        trangThai = false;

    }

    public static Pool getObj() {

        for (int i = 0; i < pools.length; i++) {
            if (pools[i] == null) {
                pools[i] = new Pool();
                return pools[i];
            } else {
                if (pools[i].trangThai) {
                    pools[i].trangThai = false;
                    return pools[i];
                }
            }
        }
        return null;
    }
}
