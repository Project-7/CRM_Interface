
import java.io.Serializable;



/**
 *
 * @author MarkusH
 */
public class Geburtsdaten implements Serializable{
    
    private int geburtsID;
    private String geburtsdatum;
    private String geburtsort;

    public Geburtsdaten() {
    }

    public Geburtsdaten(String geburtsdatum, String geburtsort) {
        this.geburtsdatum = geburtsdatum;
        this.geburtsort = geburtsort;
    }

    public Geburtsdaten(int geburtsID, String geburtsdatum, String geburtsort) {
        this.geburtsID = geburtsID;
        this.geburtsdatum = geburtsdatum;
        this.geburtsort = geburtsort;
    }

    public int getGeburtsID() {
        return geburtsID;
    }

    public void setGeburtsID(int geburtsID) {
        this.geburtsID = geburtsID;
    }

    public String getGeburtsdatum() {
        return geburtsdatum;
    }

    public void setGeburtsdatum(String geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }

    public String getGeburtsort() {
        return geburtsort;
    }

    public void setGeburtsort(String geburtsort) {
        this.geburtsort = geburtsort;
    }
    
    
}
