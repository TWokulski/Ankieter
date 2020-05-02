package Gruzdzis.Wicki.ankieter.Model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table( name = "Degrees" )
public class Degrees {

    private Integer respondent_ID;
    private Float average;
    private boolean degrees_get_better;
    private boolean absence_form_classes;


}
