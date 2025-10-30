package com.pluralsight.Hogwarts;

public class DarkWizard extends Wizard {
    public DarkWizard(String name, String house, int powerLevel, String wandType) {
        super(name, house, powerLevel, wandType);
    }

    @Override
    public void castSpell(String spell) {
        super.castSpell(spell);
        System.out.println("Dark magic unleashed by " + getName() + " — beware!");
    }
}