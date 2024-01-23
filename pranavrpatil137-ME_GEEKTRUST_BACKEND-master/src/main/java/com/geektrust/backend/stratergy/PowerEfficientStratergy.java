package com.geektrust.backend.stratergy;

import com.geektrust.backend.calculations.Calculate;
import com.geektrust.backend.canvas.Direction;
import com.geektrust.backend.canvas.Point;

public class PowerEfficientStratergy implements IStratergy {

    private Point source;
    private Point destination;
    private Direction currentDirection;


    public PowerEfficientStratergy(Point source, Point destination, Direction currentDirection) {
        this.source = source;
        this.destination = destination;
        this.currentDirection = currentDirection;
    }

    public int powerSavingMoveStratergy() { // Calls calculations to get parameters required to move efficiently
        //we can have multiple stratergies for one or more characters which use calculations and apply logic 

        Direction[] directionToGo = Calculate.directionToGo(source, destination);
        int directionScore = Calculate.changeInDir(currentDirection, directionToGo) * 5;
        int distanceScore = Calculate.calculateDistance(source, destination) * 10;
        int power = 200 - distanceScore - directionScore;
        
        return power; // power after optimised use of turns and travel distance
    }
    
}
