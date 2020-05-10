package Gruzdzis.Wicki.ankieter.DTO;

import Gruzdzis.Wicki.ankieter.Model.Respondent;

public class RespondentForStatsDTO {

    private Long id;
    private boolean sex;
    private String status;
    private boolean playing_games;

    public RespondentForStatsDTO(Respondent respondent) {
        this.id = respondent.getId();
        this.sex = respondent.isSex();
        this.status = respondent.getStatus();
        this.playing_games = respondent.isPlaying_games();
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

    public boolean isPlaying_games() {
        return playing_games;
    }

    public void setPlaying_games(boolean playing_games) {
        this.playing_games = playing_games;
    }
}
