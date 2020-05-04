package Gruzdzis.Wicki.ankieter.Service;

import Gruzdzis.Wicki.ankieter.Model.Feelings;
import Gruzdzis.Wicki.ankieter.Model.Money;
import org.springframework.web.bind.annotation.ModelAttribute;

public class GameDTO {
    Long id;

    public GameDTO() {
    }

    public GameDTO(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
