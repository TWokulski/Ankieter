package Gruzdzis.Wicki.ankieter.Model;

public class Money {

    private Integer game_ID;
    private boolean spending;
    private String amount_of_spending;
    private String reason;

    public Money(Integer game_ID, boolean spending, String amount_of_spending, String reason) {
        this.game_ID = game_ID;
        this.spending = spending;
        this.amount_of_spending = amount_of_spending;
        this.reason = reason;
    }
}
