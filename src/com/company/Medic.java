package com.company;

public class Medic extends Hero {
    @Override
    public void applySuperAbility(String superAbilityType) {
        System.out.println("Medic applied a healing blast to a warrior");
    }
}
