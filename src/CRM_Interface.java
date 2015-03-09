
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MarkusH
 */

//Security Manager
//System.setSecurityManager(new RMISecurityManager());
//Policy-File
public interface CRM_Interface extends Remote {
    
    //neues Mitglied, das von Client geliefert wird, in Datenbank speichern
    public String insertMitglied(Mitglied m) throws RemoteException;
    
    //Abfragen vom Client, dass bestimmte Mitglieder zurück gibt und anzeigt
    public ArrayList<Mitglied> selectMitglied(String... args) throws RemoteException;
    
    //Daten eines Mitgliedes werden geändert
    public String updateMitglied(Mitglied m) throws RemoteException;
    
    //Daten eines Mitglieds werden gelöscht (niemals das ganze Mitglied)
    public String deleteMitglied(Mitglied m) throws RemoteException;
           
}
