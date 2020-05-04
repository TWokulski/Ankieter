package Gruzdzis.Wicki.ankieter.Service;

import Gruzdzis.Wicki.ankieter.Model.*;

public class RespondentDTO {
    Long id;

    public RespondentDTO() {
    }

    public RespondentDTO(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
