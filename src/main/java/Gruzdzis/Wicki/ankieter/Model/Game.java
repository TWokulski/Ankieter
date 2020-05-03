package Gruzdzis.Wicki.ankieter.Model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table( name = "Game" )
public class Game {

    @Id
    @GeneratedValue(generator="inc")
    @GenericGenerator(name="inc", strategy = "increment")
    private Long id;

    private String gameplay_type;
    private String type_of_game;
    private String gaming_time;
    private String started_age;
    private boolean time_increased;
    private boolean spending;


    public Game() {
    }

    public Game(Long id, String gameplay_type, String type_of_game, String gaming_time, String started_age, boolean time_increased, boolean spending) {
        this.id = id;
        this.gameplay_type = gameplay_type;
        this.type_of_game = type_of_game;
        this.gaming_time = gaming_time;
        this.started_age = started_age;
        this.time_increased = time_increased;
        this.spending = spending;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



    public String getGameplay_type() {
        return gameplay_type;
    }

    public void setGameplay_type(String gameplay_type) {
        this.gameplay_type = gameplay_type;
    }

    public String getType_of_game() {
        return type_of_game;
    }

    public void setType_of_game(String type_of_game) {
        this.type_of_game = type_of_game;
    }

    public String getGaming_time() {
        return gaming_time;
    }

    public void setGaming_time(String gaming_time) {
        this.gaming_time = gaming_time;
    }

    public String getStarted_age() {
        return started_age;
    }

    public void setStarted_age(String started_age) {
        this.started_age = started_age;
    }

    public boolean isTime_increased() {
        return time_increased;
    }

    public void setTime_increased(boolean time_increased) {
        this.time_increased = time_increased;
    }

    public boolean isSpending() {
        return spending;
    }

    public void setSpending(boolean spending) {
        this.spending = spending;
    }

}
