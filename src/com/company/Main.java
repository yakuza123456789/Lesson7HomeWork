package com.company;

public class Main {

    public static void main(String[] args) {
	HavingSuperAbility[] heroes = new HavingSuperAbility[3];
	heroes[0] = new Magic();
	heroes[1] = new Warrior();
	heroes[2] = new Medic();
	for (int i = 0; i < heroes.length; i++){
	    heroes[i].applySuperAbility(" ");
    }

    }
}
