package com.geektrust.backend.character;

import com.geektrust.backend.stratergy.IStratergy;

public abstract class GameCharacters {

    public String name;
    public int power;   
    IStratergy stratergy;
    
    public abstract int currentPower();
    public abstract void printPower();


    @Override
    public String toString() {
        return "GameCharacters [name=" + name + ", power=" + power + ", stratergy=" + stratergy
                + "]";
    }

}
