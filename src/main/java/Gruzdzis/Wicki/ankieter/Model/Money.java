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

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Game_id", nullable = false)
    private Game game;
    private String amount_of_spending;
    private String reason;


    public Money() {
    }

    public Money(Long id, Game game, String amount_of_spending, String reason) {
        this.id = id;
        this.game = game;
        this.amount_of_spending = amount_of_spending;
        this.reason = reason;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
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
