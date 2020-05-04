package Gruzdzis.Wicki.ankieter.Model;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table( name = "Feeling_Health" )
public class Feelings {

    @Id
    @GeneratedValue(generator="inc")
    @GenericGenerator(name="inc", strategy = "increment")
    private Long id;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Game_id", nullable = false)
    private Game game;

    private boolean anger_when_leveling;
    private boolean anger_when_loosing;
    private boolean loss_of_hobbies;
    private boolean thoughts_about_game;
    private boolean waste_of_good_timing;
    private boolean health_issue;
    private String symptoms;

    public Feelings() {
    }

    public Feelings(Long id, Game game, boolean anger_when_leveling, boolean anger_when_loosing, boolean loss_of_hobbies, boolean thoughts_about_game, boolean waste_of_good_timing, boolean health_issue, String symptoms) {
        this.id = id;
        this.game = game;
        this.anger_when_leveling = anger_when_leveling;
        this.anger_when_loosing = anger_when_loosing;
        this.loss_of_hobbies = loss_of_hobbies;
        this.thoughts_about_game = thoughts_about_game;
        this.waste_of_good_timing = waste_of_good_timing;
        this.health_issue = health_issue;
        this.symptoms = symptoms;
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

    public boolean isAnger_when_leveling() {
        return anger_when_leveling;
    }

    public void setAnger_when_leveling(boolean anger_when_leveling) {
        this.anger_when_leveling = anger_when_leveling;
    }

    public boolean isAnger_when_loosing() {
        return anger_when_loosing;
    }

    public void setAnger_when_loosing(boolean anger_when_loosing) {
        this.anger_when_loosing = anger_when_loosing;
    }

    public boolean isLoss_of_hobbies() {
        return loss_of_hobbies;
    }

    public void setLoss_of_hobbies(boolean loss_of_hobbies) {
        this.loss_of_hobbies = loss_of_hobbies;
    }

    public boolean isThoughts_about_game() {
        return thoughts_about_game;
    }

    public void setThoughts_about_game(boolean thoughts_about_game) {
        this.thoughts_about_game = thoughts_about_game;
    }

    public boolean isWaste_of_good_timing() {
        return waste_of_good_timing;
    }

    public void setWaste_of_good_timing(boolean waste_of_good_timing) {
        this.waste_of_good_timing = waste_of_good_timing;
    }

    public boolean isHealth_issue() {
        return health_issue;
    }

    public void setHealth_issue(boolean health_issue) {
        this.health_issue = health_issue;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }
}
