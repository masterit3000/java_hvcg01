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
public class ChiMotThucThe {

    private static ChiMotThucThe obj;

    private ChiMotThucThe() {
    }

    public static ChiMotThucThe getObj() {

        if (obj == null) {
            obj = new ChiMotThucThe();
        }
        return obj;

    }

}
