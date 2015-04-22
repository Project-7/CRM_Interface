
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author MarkusH und RobertK
 * @version 1.0
 */

//Security Manager
//System.setSecurityManager(new RMISecurityManager());
//Policy-File
public interface CRM_Interface extends Remote {
    
    /**
     * Ein neues Mitglied wird in die Datenbank gespeichert
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
       
    
    /**
     * Abfrage, die bestimmte Mitglieder zurückgibt
     * 
     * @param args Attribute von Mitglied die abgefragt werden sollen
     * @return Array-Liste von Mitgliedern (Objekten)
     * @throws RemoteException
     */
    public ArrayList<Mitglied> selectMitglied(String... args) throws RemoteException;
    
    /**
     * Abfrage, die bestimmte Geburtsdaten zurückgibt
     * 
     * @param args Attribute von Geburtsdaten die abgefragt werden sollen
     * @return Array-Liste von Geburtsdaten
     * @throws RemoteException
     */
    public ArrayList<Geburtsdaten> selectGeburtsdaten(String... args) throws RemoteException;
    
    /**
     * Abfrage, die bestimmte Kontodaten zurückgibt
     * 
     * @param args Attribute von Kontodaten die abgefragt werden sollen
     * @return Array-Liste von Kontodaten
     * @throws RemoteException
     */
    public ArrayList<Kontodaten> selectKontodaten(String... args) throws RemoteException;
    
    /**
     * Abfrage, die einen bestimmten Mitgliedsstatus zurückgibt
     * 
     * @param args Attribute von Mitgliedsstatus die abgefragt werden sollen
     * @return Array-Liste von Mitgliedsstatus
     * @throws RemoteException
     */
    public ArrayList<Mitgliedsstatus> selectMitgliedsstatus(String... args) throws RemoteException;
    
    /**
     * Abfragen, die bestimmte Studieninfos zurückgibt
     * 
     * @param args Attribute von Studiuminfo die abgefragt werden sollen
     * @return Array-Liste von Studiuminfo
     * @throws RemoteException
     */
    public ArrayList<Studiuminfo> selectStudiuminfo(String... args) throws RemoteException;
    
    /**
     * Abfrage, die das Team eines Mitglieds zurückgibt
     * 
     * @param args Attribute von Team die abgefragt werden sollen
     * @return Array-Liste von Team
     * @throws RemoteException
     */
    public ArrayList<Team> selectTeam(String... args) throws RemoteException;
    
   
    /**
     * Daten eines Mitgliedes werden geändert
     * 
     * @param m Mitglied
     * @return String Nachricht, dass Mitglied erfolgreich geändert wurde
     * @throws RemoteException
     */
    public String updateMitglied(Mitglied m) throws RemoteException;
    
    /**
     *
     * @param g Geburtsdaten
     * @return String Nachricht, dass Geburtsdaten erfolgreich geändert wurden
     * @throws RemoteException
     */
    public String updateGeburtsdaten(Geburtsdaten g) throws RemoteException;
    
    /**
     *
     * @param k Kontodaten
     * @return String Nachricht, dass Kontodaten erfolgreich geändert wurden
     * @throws RemoteException
     */
    public String updateKontodaten(Kontodaten k) throws RemoteException;
    
    /**
     *
     * @param st Mitgliedsstatus
     * @return String Nachricht, dass Mitgliedsstatus erfolgreich geändert wurde
     * @throws RemoteException
     */
    public String updateMitgliedsstatus(Mitgliedsstatus st) throws RemoteException;
    
    /**
     *
     * @param si Studiuminfo
     * @return String Nachricht, dass Studiuminfo erfolgreich geändert wurde
     * @throws RemoteException
     */
    public String updateStudiuminfo(Studiuminfo si) throws RemoteException;
    
    /**
     *
     * @param t Team
     * @param ID MitgliederID
     * @return String Nachricht, dass Team erfolgreich geändert wurde
     * @throws RemoteException
     */
    public String updateTeam(Team t, int ID) throws RemoteException;
    
    /**
     * Daten eines Mitglieds werden gelöscht/auf NULL gesetzt 
     * (das ganze Mitglied wird nie ganz gelöscht/kein SQL DELETE Befehl)
     * 
     * @param mID MitgliederID
     * @return String Nachricht, dass Mitglied erfolgreich gelöscht wurde
     * @throws RemoteException
     */
    public String deleteMitglied(int mID) throws RemoteException;
    
    //TODO Automatischer Aufruf der Methode
    /**
     * Das Attribut aktSemester wird jeweils am 15.03. und am 1.10. vollautomatisch um eins hochgezählt
     * 
     * @throws RemoteException
     */
    public void updateSemester() throws RemoteException;
           
}
