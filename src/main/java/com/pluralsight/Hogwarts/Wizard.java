package com.pluralsight.Hogwarts;

public class Wizard {
    public static String school = "Hogwarts";
    public static int totalSpellsCast = 0;

    private String name;
    private String house;
    private int powerLevel;
    private String wandType;
    private Wand wand;
    private int spellsCast = 0;

    public Wizard(String name, String house, int powerLevel, String wandType) {
        this.name = name; this.house = house; this.powerLevel = powerLevel; this.wandType = wandType;
    }

    public static void welcomeMessage() {
        System.out.println("Welcome to " + school + " School of Witchcraft and Wizardry!");
    }

    // getters/setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getHouse() { return house; }
    public void setHouse(String house) { this.house = house; }

    public int getPowerLevel() { return powerLevel; }
    public void setPowerLevel(int powerLevel) { this.powerLevel = powerLevel; }

    public String getWandType() { return wandType; }
    public void setWandType(String wandType) { this.wandType = wandType; }

    public Wand getWand() { return wand; }
    public void setWand(Wand wand) { this.wand = wand; }

    public int getSpellsCast() { return spellsCast; }

    public void castSpell(String spell) {
        spellsCast++; totalSpellsCast++;
        System.out.println(name + " from " + house + " casts " + spell + "!");
    }

    public void increasePower(int amount) { powerLevel += amount; }
    public void decreasePower(int amount) { powerLevel = Math.max(0, powerLevel - amount); }

    @Override
    public String toString() {
        return name + " (" + house + ") power:" + powerLevel + " wand:" + wandType;
    }
}