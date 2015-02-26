
import java.io.Serializable;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kalya
 */
public class Mitglied extends Person implements Serializable{
    
    private int mitgliederID;
    private int angemeldet;
    private String studiumGenerale;
    private String email_eRacing;
    private String fuererschein;
    private String vermerk;
    private int werkstattregeln;
    private int serverzugang;
    private String staatsangehoerigkeit;
    private int foto_vorhanden;
    private String Position;
    //private Object con = ERacing_Main.verbindungsaufbau();

    public int getMitgliederID() {
        return mitgliederID;
    }

    public int isAngemeldet() {
        return angemeldet;
    }

    public String getStudiumGenerale() {
        return studiumGenerale;
    }

    public String getEmail_eRacing() {
        return email_eRacing;
    }

    public String getFuererschein() {
        return fuererschein;
    }

    public String getVermerk() {
        return vermerk;
    }

    public int isWerkstattregeln() {
        return werkstattregeln;
    }

    public int isServerzugang() {
        return serverzugang;
    }

    public String getStaatsangehoerigkeit() {
        return staatsangehoerigkeit;
    }

    public int isFoto_vorhanden() {
        return foto_vorhanden;
    }

    public String getPosition() {
        return Position;
    }

    public void setAngemeldet(int angemeldet) {
        this.angemeldet = angemeldet;
    }

    public void setStudiumGenerale(String studiumGenerale) {
        this.studiumGenerale = studiumGenerale;
    }

    public void setEmail_eRacing(String email_eRacing) {
        this.email_eRacing = email_eRacing;
    }

    public void setFuererschein(String fuererschein) {
        this.fuererschein = fuererschein;
    }

    public void setVermerk(String vermerk) {
        this.vermerk = vermerk;
    }

    public void setWerkstattregeln(int werkstattregeln) {
        this.werkstattregeln = werkstattregeln;
    }

    public void setServerzugang(int serverzugang) {
        this.serverzugang = serverzugang;
    }

    public void setStaatsangehoerigkeit(String staatsangehoerigkeit) {
        this.staatsangehoerigkeit = staatsangehoerigkeit;
    }

    public void setFoto_vorhanden(int foto_vorhanden) {
        this.foto_vorhanden = foto_vorhanden;
    }

    public void setPosition(String Position) {
        this.Position = Position;
    }

    public Mitglied(){
           //default constr
    }
    
    public Mitglied(String vorname, String name, String telefonnr, String email, String strasseHsnr, int plz, String ort,int angemeldet, String studiumGenerale, String email_eRacing, String fuererschein, String vermerk, int werkstattregeln, int serverzugang, String staatsangehoerigkeit, int foto_vorhanden, String Position) {
        super(vorname, name, telefonnr, email, strasseHsnr, plz, ort);
        this.angemeldet = angemeldet;
        this.studiumGenerale = studiumGenerale;
        this.email_eRacing = email_eRacing;
        this.fuererschein = fuererschein;
        this.vermerk = vermerk;
        this.werkstattregeln = werkstattregeln;
        this.serverzugang = serverzugang;
        this.staatsangehoerigkeit = staatsangehoerigkeit;
        this.foto_vorhanden = foto_vorhanden;
        this.Position = Position;
    } 
}
