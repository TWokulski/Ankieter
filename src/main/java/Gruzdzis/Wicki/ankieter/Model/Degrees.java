package Gruzdzis.Wicki.ankieter.Model;

public class Degrees {

    private Integer respondent_ID;
    private Float average;
    private boolean degrees_get_better;
    private boolean absence_form_classes;

    public Degrees(Integer respondent_ID, Float average, boolean degrees_get_better, boolean absence_form_classes) {
        this.respondent_ID = respondent_ID;
        this.average = average;
        this.degrees_get_better = degrees_get_better;
        this.absence_form_classes = absence_form_classes;
    }
}
