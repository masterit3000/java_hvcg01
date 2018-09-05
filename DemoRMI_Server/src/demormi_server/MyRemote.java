/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demormi_server;

import demormi_interface.IMyRemote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Admin
 */
public class MyRemote extends UnicastRemoteObject implements IMyRemote {

    public MyRemote() throws RemoteException {

    }

    @Override
    public int tinhTong(int a, int b) throws RemoteException {
        System.out.println("dang goi tinh tong.............");
        return a + b;
    }

}
