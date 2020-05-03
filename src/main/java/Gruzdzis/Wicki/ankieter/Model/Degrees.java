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

    private Float average;
    private boolean degrees_get_better;
    private boolean absence_form_classes;

    public Degrees() {
    }

    public Degrees(Long id, Float average, boolean degrees_get_better, boolean absence_form_classes) {
        this.id = id;
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
