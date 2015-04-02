
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
public class Studiuminfo implements Serializable {

    private int studID;
    private int aktSemester;
    private String studiengang;

    public Studiuminfo() {
    }

    public Studiuminfo(int studID, int aktSemester, String studiengang) {
        this.studID = studID;
        this.aktSemester = aktSemester;
        this.studiengang = studiengang;
    }

    public Studiuminfo(int aktSemester, String studiengang) {
        this.aktSemester = aktSemester;
        this.studiengang = studiengang;
    }

    public int getStudID() {
        return studID;
    }

    public void setStudID(int studID) {
        this.studID = studID;
    }

    public int getAktSemester() {
        return aktSemester;
    }

    public void setAktSemester(int aktSemester) {
        this.aktSemester = aktSemester;
    }

    public String getStudiengang() {
        return studiengang;
    }

    public void setStudiengang(String studiengang) {
        this.studiengang = studiengang;
    }

}
