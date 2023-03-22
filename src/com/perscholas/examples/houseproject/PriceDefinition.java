package com.perscholas.examples.houseproject;

import java.math.BigDecimal;

public class PriceDefinition {

    private final BigDecimal floorPrice;

    public PriceDefinition(BigDecimal floorPrice){
        this.floorPrice = floorPrice;
    }

    public BigDecimal getFloorPrice(){
        return floorPrice;
    }
}
