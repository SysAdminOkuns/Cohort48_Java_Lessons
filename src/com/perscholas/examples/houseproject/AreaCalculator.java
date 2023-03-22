package com.perscholas.examples.houseproject;

public class AreaCalculator {
    private final HouseModel houseModel;

    public AreaCalculator(HouseModel houseModel){
        this.houseModel = houseModel;
    }

    public double getFloorArea(){
        return houseModel.getCurrentWidth() * houseModel.getCurrentLength();
    }
}

