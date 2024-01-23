package com.geektrust.backend.character;

import com.geektrust.backend.canvas.Direction;
import com.geektrust.backend.canvas.Point;
import com.geektrust.backend.stratergy.PowerEfficientStratergy;

public class GMan extends GameCharacters {

    private Point source;
    private Point destination;
    private Direction currentDirection;

    public GMan(Point s,Point d, Direction dir) {
        this.power = 200;
        this.name = "GMan";
        this.source = s;
        this.destination = d;
        this.currentDirection = dir;
        this.stratergy = new PowerEfficientStratergy(s, d, dir);
    }


    @Override
    public int currentPower() {
        // TODO Auto-generated method stub
        return stratergy.powerSavingMoveStratergy();
        
    }

    public void printPower() {
        System.out.println("POWER "+currentPower());
    }    
    
}
