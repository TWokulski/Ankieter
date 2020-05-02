package Gruzdzis.Wicki.ankieter.Model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table( name = "Spending" )
public class Money {

    private Integer game_ID;
    private String amount_of_spending;
    private String reason;


}
