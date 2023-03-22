package com.perscholas.examples.houseproject;

public class HouseDimension {
    private final double minimum;
    private final double maximum;

    private double current;

    public HouseDimension(double minimum, double maximum){
        this.minimum = minimum;
        this.maximum = maximum;

//        set value for current
        current = minimum;
    }

    public double getCurrent() {
        return current;
    }

    public void setCurrent(double current) {
        if(current > maximum){
            this.current = maximum;
        }
        if(current < minimum){
            this.current = minimum;
        }
    }
}

