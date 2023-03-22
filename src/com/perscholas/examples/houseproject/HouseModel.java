package com.perscholas.examples.houseproject;

public class HouseModel {

    HouseDimension houseDim;
    private double width;
    private double length;
    private double height;
    public HouseModel(double width, double length, double height, HouseDimension obj) {
        this.houseDim = obj;
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.houseDim.setCurrent(width);
        this.width = this.houseDim.getCurrent();
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.houseDim.setCurrent(length);
        this.length = this.houseDim.getCurrent();
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.houseDim.setCurrent(height);
        this.height = this.houseDim.getCurrent();
    }
}
