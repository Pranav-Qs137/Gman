package com.geektrust.backend;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("App Test")
class AppTest {

     @Test
    public void Application_Test() throws Exception{

        // Arrange
       ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
       System.setOut(new PrintStream(outputStreamCaptor));
       String[] input = new String[]{"inputTest.txt"};
       String expectedOutput = "POWER 155";
        // Act
        App.main(input);
        String actualOutput = outputStreamCaptor.toString().trim();
        // Assert
        assertEquals(expectedOutput, actualOutput);
       
    }

}
