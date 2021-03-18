package bae;

//Add Phidgets Library
import com.phidget22.*;

public class TugOfWar {
    //Handle Exceptions
    public static void main(String[] args) throws Exception{

        //Create
        DigitalInput redButton = new DigitalInput();
        DigitalOutput redLED = new DigitalOutput();
        DigitalInput greenButton = new DigitalInput();
        DigitalOutput greenLED = new DigitalOutput();

        //       Address
        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);

        //  Open
        redButton.open(1000);
        redLED.open(1000);
        greenButton.open(1000);
        greenLED.open(1000);

        // previous states
        boolean prevRed = false;
        boolean prevGreen = false;

        // counter
        int redCounter = 0;
        int greenCounter = 0;
        //Use your Phidgets
        while(true){

            // check for red press
            if (redButton.getState() && !prevRed){
                redCounter++;
            }
            // check for green press
            if (greenButton.getState() && !prevGreen){
                greenCounter++;
            }

            // check for green as winner
            if (greenCounter == 10){
                winner(greenLED, redLED);
                greenCounter = 0;
                redCounter = 0;
            }

            // check for red as winner
            else if(redCounter == 10){
                winner(redLED, greenLED);
                greenCounter = 0;
                redCounter = 0;
            }

            // set the previous states
            prevGreen = greenButton.getState();
            prevRed = redButton.getState();
            Thread.sleep(10);
        }
    }

    // method to show winner
    public static void winner(DigitalOutput winnerLED, DigitalOutput loserLED) throws Exception{
        // intial flash
        winnerLED.setState(true);
        loserLED.setState(true);
        Thread.sleep(500);
        winnerLED.setState(false);
        loserLED.setState(false);
        Thread.sleep(500);
        for (int i = 0; i < 10; i++){
            //flash winner 5 times
            if (i < 5) {
                winnerLED.setState(true);
                Thread.sleep(500);
            }
            // flash both 5 times to signal new round
            else{
                loserLED.setState(true);
                winnerLED.setState(true);
                Thread.sleep(500);
                loserLED.setState(false);
            }
            winnerLED.setState(false);
            Thread.sleep(500);
        }
    }
}