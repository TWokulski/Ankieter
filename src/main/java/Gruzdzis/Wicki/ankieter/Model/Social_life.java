package Gruzdzis.Wicki.ankieter.Model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table( name = "Friends" )
public class Social_life {

    @Id
    @GeneratedValue(generator="inc")
    @GenericGenerator(name="inc", strategy = "increment")
    private Long id;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Respondent_id", nullable = false)
    private Respondent respondent;

    private boolean friends_complaining;
    private boolean game_friend_easier;
    private boolean real_life_difficult;
    private String reasons_of_game_friends;


    public Social_life() {
    }

    public Social_life(Long id, Respondent respondent, boolean friends_complaining, boolean game_friend_easier, boolean real_life_difficult, String reasons_of_game_friends) {
        this.id = id;
        this.respondent = respondent;
        this.friends_complaining = friends_complaining;
        this.game_friend_easier = game_friend_easier;
        this.real_life_difficult = real_life_difficult;
        this.reasons_of_game_friends = reasons_of_game_friends;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Respondent getRespondent() {
        return respondent;
    }

    public void setRespondent(Respondent respondent) {
        this.respondent = respondent;
    }

    public boolean isFriends_complaining() {
        return friends_complaining;
    }

    public void setFriends_complaining(boolean friends_complaining) {
        this.friends_complaining = friends_complaining;
    }

    public boolean isGame_friend_easier() {
        return game_friend_easier;
    }

    public void setGame_friend_easier(boolean game_friend_easier) {
        this.game_friend_easier = game_friend_easier;
    }

    public boolean isReal_life_difficult() {
        return real_life_difficult;
    }

    public void setReal_life_difficult(boolean real_life_difficult) {
        this.real_life_difficult = real_life_difficult;
    }

    public String getReasons_of_game_friends() {
        return reasons_of_game_friends;
    }

    public void setReasons_of_game_friends(String reasons_of_game_friends) {
        this.reasons_of_game_friends = reasons_of_game_friends;
    }
}
