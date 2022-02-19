package com.company.inheritance;

import com.company.Character;

public class Constable extends Character {

//    unique property and ability to the constable
    private String jurisdiction;

    public Constable(String name, String jurisdiction){
        super(name, 60, 100,60,20,5);
        this.jurisdiction = jurisdiction;
    }

    public String getJurisdiction(){
        return jurisdiction;
    }

}
