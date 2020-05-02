package Gruzdzis.Wicki.ankieter.Model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table( name = "Respondent" )
public class Respondent {

    private Long id;
    private boolean sex;
    private String status;
    private String study_degree;
    private boolean playing_games;


}
