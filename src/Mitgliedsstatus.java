/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MarkusH
 */
public class Mitgliedsstatus {
    
    private int statusID;
    private String mitglied_seit;
    private String austrittsdatum;
    private String mitgliedsstatus;

    public Mitgliedsstatus() {
    }

    public Mitgliedsstatus(String mitglied_seit, String austrittsdatum, String mitgliedsstatus) {
        this.mitglied_seit = mitglied_seit;
        this.austrittsdatum = austrittsdatum;
        this.mitgliedsstatus = mitgliedsstatus;
    }

    public int getStatusID() {
        return statusID;
    }

    public void setStatusID(int statusID) {
        this.statusID = statusID;
    }

    public String getMitglied_seit() {
        return mitglied_seit;
    }

    public void setMitglied_seit(String mitglied_seit) {
        this.mitglied_seit = mitglied_seit;
    }

    public String getAustrittsdatum() {
        return austrittsdatum;
    }

    public void setAustrittsdatum(String austrittsdatum) {
        this.austrittsdatum = austrittsdatum;
    }

    public String getMitgliedsstatus() {
        return mitgliedsstatus;
    }

    public void setMitgliedsstatus(String mitgliedsstatus) {
        this.mitgliedsstatus = mitgliedsstatus;
    }
    
    
    
}
