package Gruzdzis.Wicki.ankieter.Model;

public class Social_life {

    private Integer respondent_ID;
    private boolean friends_complaining;
    private boolean game_friend_easier;
    private boolean real_life_difficult;
    private String reasons_of_game_friends;

    public Social_life(Integer respondent_ID, boolean friends_complaining,
                       boolean game_friend_easier, boolean real_life_difficult,
                       String reasons_of_game_friends) {
        this.respondent_ID = respondent_ID;
        this.friends_complaining = friends_complaining;
        this.game_friend_easier = game_friend_easier;
        this.real_life_difficult = real_life_difficult;
        this.reasons_of_game_friends = reasons_of_game_friends;
    }
}
