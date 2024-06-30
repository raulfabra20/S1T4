package n1.ex1.models;

import java.util.ArrayList;

public class MonthsList {
    private ArrayList<String> months;

    public MonthsList(){
        months = new ArrayList<>();
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");

    }

    public ArrayList<String> getMonths() {
        return months;
    }

    public void setMonths(ArrayList<String> months) {
        this.months = months;
    }

    @Override
    public String toString() {
        return "MonthsList{" +
                "months=" + months +
                '}';
    }
}
