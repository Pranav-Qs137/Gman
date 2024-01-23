package com.geektrust.backend.appConfig;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import com.geektrust.backend.Exceptions.InvalidFileNameException;
import com.geektrust.backend.Exceptions.InvalidInputException;
import com.geektrust.backend.canvas.Direction;
import com.geektrust.backend.canvas.Point;
import com.geektrust.backend.character.GMan;
import com.geektrust.backend.character.GameCharacters;


public class Setup {

    private static final int MAX_LIMIT = 6;
    private static final int MIN_LIMIT = 0;


    Point source = new Point(0, 0);
    Point destination = new Point(0, 0);
    Direction currDir = Direction.NONE;
    GameCharacters gman;

    public GameCharacters runGmanRun(String[] args) throws IllegalArgumentException {

        if(args == null)
        throw new InvalidFileNameException("File name is empty or wrong");

        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {

            //reading Source cordinates
            String line = reader.readLine();
            String[] words = line.split(" ");
            source.x = Integer.parseInt(words[1]);
            source.y = Integer.parseInt(words[2]);
            currDir = Direction.valueOf(words[3]);

            //reading Destination cordinates
            line = reader.readLine();
            words = line.split(" ");
            destination.x = Integer.parseInt(words[1]);
            destination.y = Integer.parseInt(words[2]);

            //Validating contraints for source and destination using custom exception
            if(!isValidCoordinate(source.x,source.y))
             throw new InvalidInputException("Source Coordinates are out of bound");
            
            if(!isValidCoordinate(destination.x,destination.y))
             throw new InvalidInputException("Destination Coordinates are out of bound");

             //Reading the command 
             line = reader.readLine();
             if(line.equals("PRINT_POWER")) {
             gman = new GMan(source, destination, currDir); }
             else { 
             throw new InvalidInputException("Invalid Command");}

             reader.close();

        }catch (InvalidInputException e) {
            System.err.println("Invalid Input Exception : " + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return gman;
    }

    private static boolean isValidCoordinate(int x, int y) {
        return (x >= MIN_LIMIT && x <= MAX_LIMIT && y >= MIN_LIMIT && y <= MAX_LIMIT);
    }

    @Override
    public String toString() {
        return "Setup [currDir=" + currDir + ", destination=" + destination + ", gman=" + gman
                + ", source=" + source + "]";
    }
    
}
