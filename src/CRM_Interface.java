
import java.rmi.Remote;
import java.rmi.RemoteException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MarkusH
 */
public interface CRM_Interface extends Remote {
    
    public String writeNewMitgliedInDatabase(Mitglied m) throws RemoteException;
           
}
