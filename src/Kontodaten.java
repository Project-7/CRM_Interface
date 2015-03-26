
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
public class Kontodaten implements Serializable{
    
    private int kontoID;
    private String kreditinstitut;
    private int kontonr;
    private String iban; 
    private int blz;
    private String bic; 

    public Kontodaten() {
    }

    public Kontodaten(String kreditinstitut, int kontonr, String iban, int blz, String bic) {
        this.kreditinstitut = kreditinstitut;
        this.kontonr = kontonr;
        this.iban = iban;
        this.blz = blz;
        this.bic = bic;
    }

    public int getKontoID() {
        return kontoID;
    }

    public void setKontoID(int kontoID) {
        this.kontoID = kontoID;
    }

    public String getKreditinstitut() {
        return kreditinstitut;
    }

    public void setKreditinstitut(String kreditinstitut) {
        this.kreditinstitut = kreditinstitut;
    }

    public int getKontonr() {
        return kontonr;
    }

    public void setKontonr(int kontonr) {
        this.kontonr = kontonr;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public int getBlz() {
        return blz;
    }

    public void setBlz(int blz) {
        this.blz = blz;
    }

    public String getBic() {
        return bic;
    }

    public void setBic(String bic) {
        this.bic = bic;
    }
    
    
    
    
}
