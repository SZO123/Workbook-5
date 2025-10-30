package com.pluralsight.Hogwarts;

public class Professor extends Wizard {
    private String subject;
    public Professor(String name, String house, int powerLevel, String wandType, String subject) {
        super(name, house, powerLevel, wandType);
        this.subject = subject;
    }
    public String getSubject() { return subject; }
    public void setSubject(String subject) { this.subject = subject; }

    @Override
    public void castSpell(String spell) {
        super.castSpell(spell);
        System.out.println("Professor " + getName() + " demonstrates the spell with pedagogy.");
    }

    public void teachSpell(String spell) {
        System.out.println("Professor " + getName() + " teaches " + spell + " in " + subject + " class.");
    }
}