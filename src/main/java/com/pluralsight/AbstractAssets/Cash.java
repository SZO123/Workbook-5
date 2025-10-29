package com.pluralsight.AbstractAssets;

public class Cash extends Asset {

    // Call the parent constructor
    public Cash(String description, String dateAcquired, double originalCost) {
        super(description, dateAcquired, originalCost);
    }
    @Override
    public double getValue() {
        return getOriginalCost();
        // cash value will not change
    }
}

