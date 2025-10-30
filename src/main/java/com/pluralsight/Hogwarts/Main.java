package com.pluralsight.Hogwarts;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Wizard.welcomeMessage();

        Wizard harry = new Wizard("Harry", "Gryffindor", 80, "Holly, Phoenix feather");
        Wizard hermione = new Wizard("Hermione", "Gryffindor", 95, "Vine, Dragon heartstring");
        Wizard ron = new Wizard("Ron", "Gryffindor", 60, "Willow, Unicorn hair");

        harry.setWand(new Wand("Holly", "Phoenix feather", 11.0));
        hermione.setWand(new Wand("Vine", "Dragon heartstring", 10.75));
        ron.setWand(new Wand("Willow", "Unicorn hair", 14.0));

        harry.castSpell("Expelliarmus");
        hermione.castSpell("Alohomora");
        ron.castSpell("Wingardium Leviosa");

        System.out.println("Hermione spells cast: " + hermione.getSpellsCast());
        System.out.println("Total spells cast: " + Wizard.totalSpellsCast);

        List<Wizard> wizards = new ArrayList<>();
        wizards.add(harry); wizards.add(hermione); wizards.add(ron);

        Professor mcgonagall = new Professor("McGonagal", "Gryffindor", 99, "Fir, Dragon heartstring", "Transfiguration");
        mcgonagall.setWand(new Wand("Fir", "Dragon heartstring", 12.5));
        DarkWizard voldy = new DarkWizard("Voldemort", "Slytherin", 100, "Yew, Thestral tail hair");
        voldy.setWand(new Wand("Yew", "Thestral tail hair", 13.5));

        wizards.add(mcgonagall); wizards.add(voldy);

        System.out.println("\n--- Polymorphism demo ---");
        for (Wizard w : wizards) {
            w.castSpell("Practice Spell");
        }

        System.out.println("\n--- instanceof checks ---");
        for (Wizard w : wizards) {
            if (w instanceof Professor) {
                Professor p = (Professor) w;
                System.out.println(p.getName() + " teaches " + p.getSubject());
            } else if (w instanceof DarkWizard) {
                System.out.println(" Use caution! Dark wizard detected: " + w.getName());
            } else {
                System.out.println("Regular wizard encountered: " + w.getName());
            }
        }

        System.out.println("\n--- Wand details ---");
        for (Wizard w : wizards) {
            Wand wd = w.getWand();
            if (wd != null) {
                System.out.printf("%s's wand: %s, %s core, %.2f inches%n",
                        w.getName(), wd.getWood(), wd.getCore(), wd.getLength());
            } else {
                System.out.println(w.getName() + " has no wand assigned.");
            }
        }

        harry.increasePower(5);
        System.out.println("\nHarry's new power level: " + harry.getPowerLevel());
    }
}