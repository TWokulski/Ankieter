package Gruzdzis.Wicki.ankieter.Model;

public class Addiction {

    private Integer respondent_ID;
    private String what_is_game_addiction;
    private boolean awareness_of_addiction;


    public Addiction(Integer respondent_ID, String what_is_game_addiction, boolean awareness_of_addiction) {
        this.respondent_ID = respondent_ID;
        this.what_is_game_addiction = what_is_game_addiction;
        this.awareness_of_addiction = awareness_of_addiction;
    }


}
