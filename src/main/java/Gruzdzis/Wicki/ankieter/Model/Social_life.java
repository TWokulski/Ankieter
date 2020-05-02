package Gruzdzis.Wicki.ankieter.Model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table( name = "Friends" )
public class Social_life {

    private Integer respondent_ID;
    private boolean friends_complaining;
    private boolean game_friend_easier;
    private boolean real_life_difficult;
    private String reasons_of_game_friends;

}
