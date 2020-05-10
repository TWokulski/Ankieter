package Gruzdzis.Wicki.ankieter.DTO;

import java.util.ArrayList;

public class StatsDTO {

    ArrayList categoryList;
    ArrayList valueForCategoryList;

    public StatsDTO() {
    }

    public ArrayList getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(ArrayList categoryList) {
        this.categoryList = categoryList;
    }

    public ArrayList getValueForCategoryList() {
        return valueForCategoryList;
    }

    public void setValueForCategoryList(ArrayList valueForCategoryList) {
        this.valueForCategoryList = valueForCategoryList;
    }
}
