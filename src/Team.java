
import java.io.Serializable;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kalya
 */
public class Team implements Serializable{

    private String team;

    public Team() {
    }

    public Team(String team) {
        this.team = team;
    }
    

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
