package Gruzdzis.Wicki.ankieter.Model;

public class Game {

    private Integer id;
    private Integer respondent_ID;
    private boolean playing_games;
    private String gameplay_type;
    private String type_of_game;
    private String gaming_time;
    private String started_age;
    private boolean time_increased;

    public Game(Integer id, Integer respondent_ID, boolean playing_games,
                String gameplay_type, String type_of_game, String gaming_time,
                String started_age, boolean time_increased) {

        this.id = id;
        this.respondent_ID = respondent_ID;
        this.playing_games = playing_games;
        this.gameplay_type = gameplay_type;
        this.type_of_game = type_of_game;
        this.gaming_time = gaming_time;
        this.started_age = started_age;
        this.time_increased = time_increased;
    }
}
