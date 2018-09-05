/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demormi_server;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class DemoRMI_Server {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            MyRemote remote = new MyRemote();
//            LocateRegistry.createRegistry(3389);
            LocateRegistry.createRegistry(8888);
            Naming.rebind("rmi://localhost:8888/abc", remote);//dua obj remote ra cong de cho client goi den
            System.out.println("server ok ....");
        } catch (RemoteException ex) {
            Logger.getLogger(DemoRMI_Server.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(DemoRMI_Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
