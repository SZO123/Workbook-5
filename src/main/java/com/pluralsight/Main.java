package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        Moped moterBike = new Moped("BMW", "C 400 GT", 2024, 35.0, false);
        Car myCar = new Car("Tesla", "Model 3", 2024, 160.0, true);
        SemiTruck myTruck = new SemiTruck("Volvo", "VNL", 2022, 90.0, false);
        Hovercraft boat = new Hovercraft("AeroX", "Hover-3000", 2023, 100.0, true);

        printVehiclesInfo("Moped", moterBike);
        printVehiclesInfo("Car", myCar);
        printVehiclesInfo("SemiTruck", myTruck);
        printVehiclesInfo("Hovercraft", boat);
    }

    private static void printVehiclesInfo(String label, Vehicles v) {
        System.out.println(label + " - make: " + v.getMake()
                + ", model: " + v.getModel()
                + ", year: " + v.getYear()
                + ", maxSpeed: " + v.getMaxSpeed()
                + " mph, electric: " + v.isElectric());
    }
}