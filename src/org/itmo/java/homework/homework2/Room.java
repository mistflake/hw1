package org.itmo.java.homework.homework2;

public class Room {
    private Double length;
    private Double height;
    private Double width;
    private String purpose;
    private Finishing finishing;

    public Room () {
        this.finishing=Finishing.RAW;
    }

    public Room(Double length, Double height, Double width, String purpose) {
        if (length > 0 && height > 0 && width > 0) {
            this.length = length;
            this.height = height;
            this.width = width;
        } else {
            this.length = 0.0;
            this.height = 0.0;
            this.width = 0.0;
        }
        this.purpose = purpose;
        this.finishing=Finishing.RAW;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        if (length > 0) {
            this.length = length;
        } else {
            System.err.println("measurement < 0");
        }
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        if (height > 0) {
            this.height = height;
        } else {
            System.err.println("measurement < 0");
        }
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        if (width > 0) {
            this.width = width;
        } else {
            System.err.println("measurement < 0");
        }
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public Finishing getFinishing() {
        return finishing;
    }

    public void setFinishing(Finishing finishing) {
        this.finishing = finishing;
    }
}
