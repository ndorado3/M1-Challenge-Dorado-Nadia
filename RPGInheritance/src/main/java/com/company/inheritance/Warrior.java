package com.company.inheritance;

import com.company.Character;

public class Warrior extends Character {
//    unique property
    private int shieldStrength;
    public Warrior(String name){
        super(name, 75, 100,100,50,10);
        this.shieldStrength = 100;
    }

    public int getShieldStrength() {
        return shieldStrength;
    }

    public void setShieldStrength(int shieldStrength) {
        this.shieldStrength = shieldStrength;
    }
}
