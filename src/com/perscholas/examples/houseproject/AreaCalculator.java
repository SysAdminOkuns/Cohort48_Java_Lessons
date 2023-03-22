package com.perscholas.examples.houseproject;

public class AreaCalculator {
    private double width;
    private double length;
    private  double height;

    public AreaCalculator(double width, double length){
        this.width = width;
        this.length = length;
    }
    public AreaCalculator(double width, double length, double height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public double calcArea(){
        return this.width * this.length * this.height;
    }

    public double calcWallArea(){
        return this.width * this.length;
    }

    public double calcCarPortArea(){
        return this.width * this.length;
    }
}

