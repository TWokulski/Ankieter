package Gruzdzis.Wicki.ankieter.Model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table( name = "Spending" )
public class Money {

    @Id
    @GeneratedValue(generator="inc")
    @GenericGenerator(name="inc", strategy = "increment")
    private Long id;

    private String amount_of_spending;
    private String reason;


    public Money() {
    }

    public Money(Long id, String amount_of_spending, String reason) {
        this.id = id;

        this.amount_of_spending = amount_of_spending;
        this.reason = reason;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getAmount_of_spending() {
        return amount_of_spending;
    }

    public void setAmount_of_spending(String amount_of_spending) {
        this.amount_of_spending = amount_of_spending;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
