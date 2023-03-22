package com.perscholas.examples.houseproject;

public class PriceDefinition {

    //    price per square meter
    private final double floor_price;
    private double wall_price;
    private double carport_price;

    public PriceDefinition(double floor_price, double wall_price, double carport_price){
        this.floor_price = floor_price;
        this.wall_price = wall_price;
        this.carport_price = carport_price;
    }

    public double getFloor_price() {
        return floor_price;
    }

    public double getWall_price() {
        return wall_price;
    }

    public double getCarport_price() {
        return carport_price;
    }
}
