package bae;

//Add Phidgets Library
import com.phidget22.*;

public class SteadyAsItGoes {
    //Handle Exceptions
    public static void main(String[] args) throws Exception{

        //Create
        DigitalInput redButton = new DigitalInput();
        DigitalOutput redLED = new DigitalOutput();
        DigitalInput greenButton = new DigitalInput();
        DigitalOutput greenLED = new DigitalOutput();

        //Address
        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);

        //Open
        redButton.open(1000);
        redLED.open(1000);
        greenButton.open(1000);
        greenLED.open(1000);

        // initial push
        boolean redPressed = false;
        boolean greenPressed = false;

        // counters
        int redCount = 0;
        int greenCount = 0;

        // previous states
        boolean prevRed = false;
        boolean prevGreen = false;

        //Use your Phidgets
        while(true){

            // check for initial red press
            if( redButton.getState() && !prevRed) {
                greenPressed = false;
                redPressed = true;
                redCount++;
                System.out.println("red has been pushed: " + redCount + " times");
                }

            // check for initial green press
            if(greenButton.getState() && !prevGreen) {
                greenPressed = true;
                redPressed = false;
                greenCount++;
                System.out.println("green has been pushed: " + greenCount + " times");
            }

            // set green light
            greenLED.setState(greenPressed);




            // set red light
            redLED.setState(redPressed);

            // set the previous state to current state
            prevRed = redButton.getState();
            prevGreen = greenButton.getState();

            Thread.sleep(150);
        }
    }
}
