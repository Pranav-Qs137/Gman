package com.geektrust.backend;

import java.io.IOException;
import com.geektrust.backend.appConfig.Setup;
import com.geektrust.backend.character.GameCharacters;

public class App {

	public static void main(String[] args) throws IOException {
		//System.out.println(" Welcome to \"Power The of GMan\"");
		Setup config = new Setup();
        GameCharacters gman = config.runGmanRun(new String[]{"input.txt"});
        gman.printPower();				
	}

}
