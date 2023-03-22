package com.perscholas.examples.houseproject;

public class CarPort {

    private double width = 0;
    private double length = 0;
    HouseDimension houseDimension;

    public CarPort(double width, double length, HouseDimension obj) {
        this.width = width;
        this.length = length;
        this.houseDimension = obj;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
//        minimum 0 and maximum 7.2 meters
        this.houseDimension.setCurrent(width);
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        //        minimum 0 and maximum 7.2 meters
        this.houseDimension.setCurrent(length);
        this.length = length;
    }


}

