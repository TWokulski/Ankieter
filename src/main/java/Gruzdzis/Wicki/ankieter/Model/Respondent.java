package Gruzdzis.Wicki.ankieter.Model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table( name = "Respondent" )
public class Respondent {

    @Id
    @GeneratedValue(generator="inc")
    @GenericGenerator(name="inc", strategy = "increment")
    private Long id;

    private boolean sex;
    private String status;
    private String study_degree;
    private String living_with;
    private boolean playing_games;

    @OneToOne(mappedBy = "respondent", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Game game;

    @OneToOne(mappedBy = "respondent", fetch = FetchType.EAGER,
            cascade = CascadeType.ALL)
    private Addiction addiction;

    @OneToOne(mappedBy = "respondent", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Degrees degrees;

    @OneToOne(mappedBy = "respondent", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Social_life social_life;


    public Respondent() {
    }

    public Respondent(Long id, boolean sex, String status, String study_degree, String living_with, boolean playing_games, Game game, Addiction addiction, Degrees degrees, Social_life social_life) {
        this.id = id;
        this.sex = sex;
        this.status = status;
        this.study_degree = study_degree;
        this.living_with = living_with;
        this.playing_games = playing_games;
        this.game = game;
        this.addiction = addiction;
        this.degrees = degrees;
        this.social_life = social_life;
    }

    public String getLiving_with() {
        return living_with;
    }

    public void setLiving_with(String living_with) {
        this.living_with = living_with;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStudy_degree() {
        return study_degree;
    }

    public void setStudy_degree(String study_degree) {
        this.study_degree = study_degree;
    }

    public boolean isPlaying_games() {
        return playing_games;
    }

    public void setPlaying_games(boolean playing_games) {
        this.playing_games = playing_games;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Addiction getAddiction() {
        return addiction;
    }

    public void setAddiction(Addiction addiction) {
        this.addiction = addiction;
    }

    public Degrees getDegrees() {
        return degrees;
    }

    public void setDegrees(Degrees degrees) {
        this.degrees = degrees;
    }

    public Social_life getSocial_life() {
        return social_life;
    }

    public void setSocial_life(Social_life social_life) {
        this.social_life = social_life;
    }
}
