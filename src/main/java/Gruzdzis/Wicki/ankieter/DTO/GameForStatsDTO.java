package Gruzdzis.Wicki.ankieter.DTO;

import Gruzdzis.Wicki.ankieter.Model.Game;

public class GameForStatsDTO {

    private Long id;
    private String gaming_time;
    private boolean spending;

    public GameForStatsDTO(Game game) {
        this.id = game.getId();
        this.gaming_time = game.getGaming_time();
        this.spending = game.isSpending();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGaming_time() {
        return gaming_time;
    }

    public void setGaming_time(String gaming_time) {
        this.gaming_time = gaming_time;
    }

    public boolean isSpending() {
        return spending;
    }

    public void setSpending(boolean spending) {
        this.spending = spending;
    }
}
