package Gruzdzis.Wicki.ankieter.Model;


public class Feelings {

    private Integer game_ID;
    private boolean anger_when_leveling;
    private boolean anger_when_loosing;
    private boolean loss_of_hobbies;
    private boolean thoughts_about_game;
    private boolean waste_of_good_timing;
    private boolean health_issue;
    private String symptoms;

    public Feelings(Integer game_ID, boolean anger_when_leveling,
                    boolean anger_when_loosing, boolean loss_of_hobbies,
                    boolean thoughts_about_game, boolean waste_of_good_timing,
                    boolean health_issue, String symptoms) {
        this.game_ID = game_ID;
        this.anger_when_leveling = anger_when_leveling;
        this.anger_when_loosing = anger_when_loosing;
        this.loss_of_hobbies = loss_of_hobbies;
        this.thoughts_about_game = thoughts_about_game;
        this.waste_of_good_timing = waste_of_good_timing;
        this.health_issue = health_issue;
        this.symptoms = symptoms;
    }
}
