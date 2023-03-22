package com.perscholas.examples.houseproject;

import java.math.BigDecimal;

public class PriceCalculator {

    PriceDefinition pd;
    AreaCalculator ac;

    public PriceCalculator(PriceDefinition pd, AreaCalculator ac) {
        this.pd = pd;
        this.ac = ac;
    }

    public BigDecimal calculatePrice() {
        double floor_p = Double.valueOf(this.pd.getFloor_price()) * Double.valueOf(this.ac.calcArea());
        BigDecimal floor_price = BigDecimal.valueOf(floor_p);
        return floor_price;
    }

    public BigDecimal calculateWallPrice() {
        double wall_p = Double.valueOf(this.pd.getWall_price()) * Double.valueOf(this.ac.calcWallArea());
        BigDecimal wall_price = BigDecimal.valueOf(wall_p);
        return wall_price;
    }

    public BigDecimal calculateCarPortPrice() {
        double carPort_p = Double.valueOf(this.pd.getCarport_price()) * Double.valueOf(this.ac.calcCarPortArea());
        BigDecimal carPort_price = BigDecimal.valueOf(carPort_p);
        return carPort_price;
    }
}

