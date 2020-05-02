package Gruzdzis.Wicki.ankieter.Model;


import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table( name = "Feeling_Health" )
public class Feelings {

    private Integer game_ID;
    private boolean anger_when_leveling;
    private boolean anger_when_loosing;
    private boolean loss_of_hobbies;
    private boolean thoughts_about_game;
    private boolean waste_of_good_timing;
    private boolean health_issue;
    private String symptoms;

}
