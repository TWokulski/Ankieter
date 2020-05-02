package Gruzdzis.Wicki.ankieter.Model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table( name = "Addiction" )
public class Addiction {

    private Integer respondent_ID;
    private String what_is_game_addiction;
    private boolean awareness_of_addiction;




}
