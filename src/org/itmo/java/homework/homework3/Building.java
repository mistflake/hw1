package org.itmo.java.homework.homework3;

import java.util.Calendar;

public class Building {
    private Integer floors;
    private Integer yearBuilt;
    private String name;

    public Building () {

    }

    public void setValues (Integer floors, Integer yearBuilt, String name) {
        this.floors = floors;
        this.yearBuilt = yearBuilt;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Building{" +
                "floors=" + floors +
                ", yearBuilt=" + yearBuilt +
                ", name='" + name + '\'' +
                '}';
    }

    public Integer yearsSinceBuilt() {
        int currYear = Calendar.getInstance().get(Calendar.YEAR);

        if (currYear > this.yearBuilt) {
            return currYear - this.yearBuilt;
        } else {
            System.err.println("building from the future?");
            return null;
        }
    }
}
