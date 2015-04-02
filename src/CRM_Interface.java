
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
    /**
     *
     * @param m Mitglied
     * @param g Geburtsdaten
     * @param k Kontodaten
     * @param st Mitgliedsstatus
     * @param si Studiuminfo
     * @param t Team
     * @return String Rückmeldung vom Server, ob INSERT funktioniert hat
     * @throws RemoteException
     */
    public String insertMitglied(Mitglied m, Geburtsdaten g, Kontodaten k, Mitgliedsstatus st, Studiuminfo si, Team t) throws RemoteException;
       
    //Abfragen vom Client, dass bestimmte Mitglieder zurück gibt und anzeigt
    /**
     *
     * @param args
     * @return
     * @throws RemoteException
     */
    public ArrayList<Mitglied> selectMitglied(String... args) throws RemoteException;
    
    /**
     *
     * @param args
     * @return
     * @throws RemoteException
     */
    public ArrayList<Geburtsdaten> selectGeburtsdaten(String... args) throws RemoteException;
    
    /**
     *
     * @param args Eingaben des Clients
     * @return
     * @throws RemoteException
     */
    public ArrayList<Kontodaten> selectKontodaten(String... args) throws RemoteException;
    
    /**
     *
     * @param args
     * @return
     * @throws RemoteException
     */
    public ArrayList<Mitgliedsstatus> selectMitgliedsstatus(String... args) throws RemoteException;
    
    /**
     *
     * @param args
     * @return
     * @throws RemoteException
     */
    public ArrayList<Studiuminfo> selectStudiuminfo(String... args) throws RemoteException;
    
    /**
     *
     * @param args
     * @return
     * @throws RemoteException
     */
    public ArrayList<Team> selectTeam(String... args) throws RemoteException;
    
    //Daten eines Mitgliedes werden geändert
    /**
     *
     * @param m
     * @return
     * @throws RemoteException
     */
    public String updateMitglied(Mitglied m) throws RemoteException;
    
    /**
     *
     * @param g
     * @return
     * @throws RemoteException
     */
    public String updateGeburtsdaten(Geburtsdaten g) throws RemoteException;
    
    //Daten eines Mitglieds werden gelöscht/auf NULL gesetzt (nicht das ganze Mitglied)
    /**
     *
     * @param mID
     * @return
     * @throws RemoteException
     */
    public String deleteMitglied(int mID) throws RemoteException;
    
    //Semester wird jeweils am 15.03. und am 1.10. vollautomatisch um eins hochgezählt
    //TODO Automatischer Aufruf der Methode
    /**
     *
     * @throws RemoteException
     */
    public void updateSemester() throws RemoteException;
           
}
