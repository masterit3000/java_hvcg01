/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demormi_interface;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Admin
 */
public interface IMyRemote extends Remote {

    int tinhTong(int a, int b) throws RemoteException;

}
