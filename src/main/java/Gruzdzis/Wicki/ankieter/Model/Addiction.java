package Gruzdzis.Wicki.ankieter.Model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table( name = "Addiction" )
public class Addiction {

    @Id
    @GeneratedValue(generator="inc")
    @GenericGenerator(name="inc", strategy = "increment")
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Respondent_id")
    private Respondent respondent;

    private String what_is_game_addiction;
    private boolean awareness_of_addiction;
    private boolean waste_of_time;

    public Addiction() {
    }

    public Addiction(Long id, Respondent respondent, String what_is_game_addiction, boolean awareness_of_addiction, boolean waste_of_time) {
        this.id = id;
        this.respondent = respondent;
        this.what_is_game_addiction = what_is_game_addiction;
        this.awareness_of_addiction = awareness_of_addiction;
        this.waste_of_time = waste_of_time;
    }

    public boolean isWaste_of_time() {
        return waste_of_time;
    }

    public void setWaste_of_time(boolean waste_of_time) {
        this.waste_of_time = waste_of_time;
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

    public String getWhat_is_game_addiction() {
        return what_is_game_addiction;
    }

    public void setWhat_is_game_addiction(String what_is_game_addiction) {
        this.what_is_game_addiction = what_is_game_addiction;
    }

    public boolean isAwareness_of_addiction() {
        return awareness_of_addiction;
    }

    public void setAwareness_of_addiction(boolean awareness_of_addiction) {
        this.awareness_of_addiction = awareness_of_addiction;
    }
}
