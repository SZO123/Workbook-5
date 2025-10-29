package com.pluralsight.AssetManager;

public class Vehicle extends Asset {
    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    // Getters and setters
    public String getMakeModel() { return makeModel; }
    public void setMakeModel(String makeModel) { this.makeModel = makeModel; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public int getOdometer() { return odometer; }
    public void setOdometer(int odometer) { this.odometer = odometer; }

    // Override getValue
    @Override
    public double getValue() {
        double value = getOriginalCost();
        int age = 2025 - year; // assume current year = 2025

        if(age <= 3) {
            value -= age * 0.03 * getOriginalCost();
        } else if(age <= 6) {
            value -= age * 0.06 * getOriginalCost();
        } else if(age <= 10) {
            value -= age * 0.08 * getOriginalCost();
        } else {
            value = 1000.0;
        }

        if(odometer > 100_000 && !makeModel.toLowerCase().contains("honda")
                && !makeModel.toLowerCase().contains("toyota")) {
            value *= 0.75; // reduce 25%
        }

        return value;
    }
}