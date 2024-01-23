package com.geektrust.backend;

import com.geektrust.backend.calculations.Calculate;
import com.geektrust.backend.canvas.Direction;
import com.geektrust.backend.canvas.Point;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


@DisplayName("Testing calculate class methods individually")
public class CalculateTest {

    @Test
    public void testCalculateDistance() {

        Point source = new Point(0, 0);
        Point destination = new Point(3, 4);
        int expectedDistance = 7;

        int actualDistance = Calculate.calculateDistance(source, destination);
        
        Assertions.assertEquals(expectedDistance, actualDistance);
    }

    @Test
    void testDirectionToGo() {

        Point source = new Point(1, 1);
        Point destination = new Point(1, 2);

        Direction[] expectedDirection = new Direction[]{Direction.NONE, Direction.N};
        Direction[] actualDirection = Calculate.directionToGo(source, destination);

        Assertions.assertArrayEquals(expectedDirection, actualDirection);
    }

    @Test
    void testChangeInDir() {

        Direction currentDirection = Direction.E;
        Direction[] directionToGo = new Direction[]{Direction.NONE, Direction.S};
        int expectedChange = 1;

        int actualChange = Calculate.changeInDir(currentDirection, directionToGo);

        Assertions.assertEquals(expectedChange, actualChange);
    }

    
    @Test
    void testCalculateDistanceWithNull() {

        Point source = null;
        Point destination = null;

        Assertions.assertThrows(NullPointerException.class, () -> Calculate.calculateDistance(source, destination));
    }


    @Test
    void testChangeInDirWithNull() {

        Direction currentDirection = null;
        Direction[] directionToGo = new Direction[]{Direction.NONE, Direction.S};

        Assertions.assertThrows(NullPointerException.class, () -> Calculate.changeInDir(currentDirection, directionToGo));
    }

}
