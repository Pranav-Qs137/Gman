# Pre-requisites
* Java 1.8/1.11/1.15
* Gradle 6

# How to run the code

**Building Project :
./gradlew build
--> Will build the whole project


**Running Project :
Run the project using following script along with Command line argument which will be "input.txt" file
./gradlew run --args="input.txt"


**There is Separate file provided which can be used for testing purposes -> "inputTest.txt"


** The code is written considering the "Power of GMan" a game which can be extented as per requirements.
- We can have control of main character Gman as well as we can have other characters if further required by using the Character Abstract class.
- The game can use different Stratergies as required by implementing IStratergy interface. For now as per problem statement we have only one stratergy which was to save power.
- We can implement it with more controls by extending with command pattern and services.
- Overall this is a Template/Skeleton code which is working as per requirement and is following open-close principles as well as standard OOP design.


We have provided scripts to execute the code. 

Use `run.sh` if you are Linux/Unix/macOS Operating systems and `run.bat` if you are on Windows.

Internally both the scripts run the following commands 

 * `gradle clean build -x test --no-daemon` - This will create a jar file `geektrust.jar` in the `build/libs` folder.
 * `java -jar build/libs/geektrust.jar sample_input/input1.txt` - This will execute the jar file passing in the sample input file as the command line argument

 Use the build.gradle file provided along with this project. Please change the main class entry under the `jar` task

 ```
 manifest {
        attributes 'Main-Class' : 'com.geektrust.backend.App' //Change this to the main class of your program which will be executed
    }
```
in the build.gradle if your main class has changed.

 # How to execute the unit tests

 `gradle clean test --no-daemon` will execute the unit test cases.

# Help

You can refer our help documents [here](https://help.geektrust.in)
You can read build instructions [here](https://github.com/geektrust/coding-problem-artefacts/tree/master/Java)
