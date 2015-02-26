
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MarkusH
 */
public abstract class Person implements Serializable{
    
    private String vorname;
    private String name;
    private String telefonnr;
    private String email;
    private String strasseHsnr;
    private int plz;
    private String ort;

    public Person() {
    }

    public Person(String vorname, String name, String telefonnr, String email, String strasseHsnr, int plz, String ort) {
        this.vorname = vorname;
        this.name = name;
        this.telefonnr = telefonnr;
        this.email = email;
        this.strasseHsnr = strasseHsnr;
        this.plz = plz;
        this.ort = ort;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelefonnr() {
        return telefonnr;
    }

    public void setTelefonnr(String telefonnr) {
        this.telefonnr = telefonnr;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStrasseHsnr() {
        return strasseHsnr;
    }

    public void setStrasseHsnr(String strasseHsnr) {
        this.strasseHsnr = strasseHsnr;
    }

    public int getPlz() {
        return plz;
    }

    public void setPlz(int plz) {
        this.plz = plz;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }
    
    
    
    
    
    
    
}
