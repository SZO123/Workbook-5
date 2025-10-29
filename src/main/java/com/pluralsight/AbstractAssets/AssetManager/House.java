package com.pluralsight.AbstractAssets.AssetManager;

public class House extends Asset {
    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;

    public House(String description, String dateAcquired, double originalCost,
                 String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    // Getters and setters
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public int getCondition() { return condition; }
    public void setCondition(int condition) { this.condition = condition; }

    public int getSquareFoot() { return squareFoot; }
    public void setSquareFoot(int squareFoot) { this.squareFoot = squareFoot; }

    public int getLotSize() { return lotSize; }
    public void setLotSize(int lotSize) { this.lotSize = lotSize; }

    // Override getValue
    @Override
    public double getValue() {
        double valuePerSqFt;
        switch(condition) {
            case 1: valuePerSqFt = 180.0; break;
            case 2: valuePerSqFt = 130.0; break;
            case 3: valuePerSqFt = 90.0; break;
            case 4: valuePerSqFt = 80.0; break;
            default: valuePerSqFt = 0; break;
        }
        return (squareFoot * valuePerSqFt) + (lotSize * 0.25);
    }
}