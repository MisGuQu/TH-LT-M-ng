/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMI_Server;
import RMI_Client.InterfaceCalc;
import RMI_Client.PhanSo;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author ad
 */
class Calc extends UnicastRemoteObject implements InterfaceCalc {
    public Calc() throws RemoteException
    {
        
    }
    public int sum (int a, int b) throws RemoteException
    {
        int t= a+b;
        return t;
    }
    public PhanSo sum (PhanSo a, PhanSo b) throws RemoteException
    {
        return a.sum(b);
    }

}
