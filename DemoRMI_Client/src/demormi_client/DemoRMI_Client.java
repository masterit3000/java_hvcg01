/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demormi_client;

import demormi_interface.IMyRemote;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class DemoRMI_Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            IMyRemote lookup = (IMyRemote) Naming.lookup("rmi://localhost:8888/abc");
            int tinhTong = lookup.tinhTong(34, 444);
            System.out.println("ket qua: "+tinhTong);
        } catch (NotBoundException ex) {
            Logger.getLogger(DemoRMI_Client.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(DemoRMI_Client.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(DemoRMI_Client.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
}
