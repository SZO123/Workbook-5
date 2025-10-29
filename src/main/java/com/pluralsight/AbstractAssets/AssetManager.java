package com.pluralsight.AbstractAssets;

import java.util.ArrayList;

public class AssetManager {
    public static void main(String[] args) {

        ArrayList<Asset> assets = new ArrayList<>();

        // Add houses
        assets.add(new House("My house", "2015-06-01", 300000, "123 Maple St", 1, 2500, 8000));
        assets.add(new House("Vacation home", "2018-07-15", 200000, "789 Oak Ave", 2, 1800, 5000));

        // Add vehicles
        assets.add(new Vehicle("Tom's truck", "2019-03-20", 40000, "Ford F-150", 2019, 120000));
        assets.add(new Vehicle("My car", "2021-05-10", 35000, "Honda Civic", 2021, 90000));

        // Add cash
        assets.add(new Cash("Cash Stash", "2025-10-29", 5000));

        // Loop through assets
        for(Asset asset : assets) {
            System.out.println("Description: " + asset.getDescription());
            System.out.println("Date Acquired: " + asset.getDateAcquired());
            System.out.println("Original Cost: $" + asset.getOriginalCost());
            System.out.println("Current Value: $" + asset.getValue());

            // Type-specific info
            if(asset instanceof House) {
                House h = (House) asset;
                System.out.println("Address: " + h.getAddress());
            } else if(asset instanceof Vehicle) {
                Vehicle v = (Vehicle) asset;
                System.out.println("Make/Model: " + v.getMakeModel() + ", Year: " + v.getYear());
            }

            System.out.println("*************************************");
        }
    }
}