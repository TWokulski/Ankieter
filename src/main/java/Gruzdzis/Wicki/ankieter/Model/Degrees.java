package Gruzdzis.Wicki.ankieter.Model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table( name = "Degrees" )
public class Degrees {

    @Id
    @GeneratedValue(generator="inc")
    @GenericGenerator(name="inc", strategy = "increment")
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Respondent_id", nullable = false)
    private Respondent respondent;

    private Float average;
    private boolean degrees_get_better;
    private boolean absence_form_classes;

    public Degrees() {
    }

    public Degrees(Long id, Respondent respondent, Float average, boolean degrees_get_better, boolean absence_form_classes) {
        this.id = id;
        this.respondent = respondent;
        this.average = average;
        this.degrees_get_better = degrees_get_better;
        this.absence_form_classes = absence_form_classes;
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

    public Float getAverage() {
        return average;
    }

    public void setAverage(Float average) {
        this.average = average;
    }

    public boolean isDegrees_get_better() {
        return degrees_get_better;
    }

    public void setDegrees_get_better(boolean degrees_get_better) {
        this.degrees_get_better = degrees_get_better;
    }

    public boolean isAbsence_form_classes() {
        return absence_form_classes;
    }

    public void setAbsence_form_classes(boolean absence_form_classes) {
        this.absence_form_classes = absence_form_classes;
    }
}
