package Gruzdzis.Wicki.ankieter.Model;

public class Respondent {

    private Integer id;
    private boolean sex;
    private String status;
    private boolean study_degree;

    public Respondent(Integer id, boolean sex, String status, boolean study_degree) {
        this.id = id;
        this.sex = sex;
        this.status = status;
        this.study_degree = study_degree;
    }
}
