package com.pluralsight.Hogwarts;

import java.util.ArrayList;
import java.util.List;

public class MBMain {
    public static void main(String[] args) {
        List<MagicalBeing> beings = new ArrayList<>();
        beings.add(new MBWizard());
        beings.add(new MBProfessor());
        beings.add(new MBDarkWizard());

        for (MagicalBeing b : beings) {
            b.introduce();
            b.useMagic();
        }
    }
}