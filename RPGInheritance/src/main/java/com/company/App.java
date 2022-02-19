package com.company;


import com.company.inheritance.Constable;
import com.company.inheritance.Farmer;
import com.company.inheritance.Warrior;

public class App {
    public static void main(String[] args) {
        Farmer farmer = new Farmer("Willy");
        Constable constable = new Constable("Tim","South");
        Warrior warrior = new Warrior("Alexander");

        System.out.println("**** Farmer ****");
        farmer.setName("Clara");
        System.out.println("Name: " + farmer.getName());
        System.out.println("Strength: " + farmer.getStrength());
        System.out.println("Is " + farmer.getName() + " plowing the land " + farmer.isPlowing());
        System.out.println("Is " + farmer.getName() + " harvesting the land" + farmer.isHarvesting());
        System.out.println(farmer.characterArrested());

        System.out.println("**** Constable ****");
        System.out.println("Name: " + constable.getName());
        System.out.println("Strength: " + constable.getStrength());
        System.out.println("Health: " + constable.getHealth());
        System.out.println("Jurisdiction: " + constable.getJurisdiction());

        System.out.println("**** Warrior ****");
        System.out.println("Name: " + warrior.getName());
        System.out.println("Strength: " + warrior.getStrength());
        System.out.println("Shield Strength: " + warrior.getShieldStrength());

    }
}
