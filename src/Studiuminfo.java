/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MarkusH
 */
public class Studiuminfo {
    
    private int studID;
    private int anfangssemester;
    private String studiengang;

    public Studiuminfo() {
    }

    public Studiuminfo(int anfangssemester, String studiengang) {
        this.anfangssemester = anfangssemester;
        this.studiengang = studiengang;
    }

    public int getStudID() {
        return studID;
    }

    public void setStudID(int studID) {
        this.studID = studID;
    }

    public int getAnfangssemester() {
        return anfangssemester;
    }

    public void setAnfangssemester(int anfangssemester) {
        this.anfangssemester = anfangssemester;
    }

    public String getStudiengang() {
        return studiengang;
    }

    public void setStudiengang(String studiengang) {
        this.studiengang = studiengang;
    }
    
    
    
    
}
