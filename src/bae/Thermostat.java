package bae;

//Add Phidgets Library
import com.phidget22.*;

public class Thermostat {
    public static void main(String[] args) throws Exception{

        //Create
        TemperatureSensor temperatureSensor = new TemperatureSensor();
        DigitalInput redButton = new DigitalInput();
        DigitalOutput redLED = new DigitalOutput();
        DigitalInput greenButton = new DigitalInput();
        DigitalOutput greenLED = new DigitalOutput();

        //address
        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);

        //Open
        temperatureSensor.open(1000);
        redButton.open(1000);
        redLED.open(1000);
        greenButton.open(1000);
        greenLED.open(1000);

        // previous states
        boolean prevRed = false;
        boolean prevGreen = false;

        // set temp
        int setTemp = 21;

        // timers
        int printTimer = 0;
        int flashTimer = 0;

        //Use your Phidgets
        while(true){

            // decrease set temperature
            if (redButton.getState() && !prevRed){
                setTemp--;
            }

            // increase set temperature
            if (greenButton.getState() && !prevGreen){
                setTemp++;
            }

            // check if temperature is within 2 degrees of the set temperature
            if (temperatureSensor.getTemperature() >= setTemp-2 && temperatureSensor.getTemperature() <= setTemp+2){
                greenLED.setState(true);
                redLED.setState(false);
            }

            // if not within 2 degrees
            else{
                greenLED.setState(false);
                redLED.setState(false);

                // if the temperature is above the set temperature
                if (temperatureSensor.getTemperature() > setTemp + 2){
                    greenLED.setState(true);
                    redLED.setState(false);

                    // flash lights at 200ms
                    if (flashTimer >= 2) {
                        greenLED.setState(false);
                        flashTimer = 0;
                    }
                }

                // if the temperature is below the set temperature
                else if (temperatureSensor.getTemperature() < setTemp - 2){
                    redLED.setState(true);
                    greenLED.setState(false);

                    //flash lights at 200 ms
                    if (flashTimer >= 2) {
                        redLED.setState(false);
                        flashTimer = 0;
                    }
                }
                flashTimer++;
            }


            // print temperature and set temperature every 5 seconds
            if (printTimer >= 50){
                printTimer = 0;
                System.out.println("The current temperature is " + temperatureSensor.getTemperature() + " and the set "
                        + "temperature is " + setTemp + " C°");
            }


            // update previous states
            prevGreen = greenButton.getState();
            prevRed = redButton.getState();
            Thread.sleep(100);
            printTimer++;
        }
    }
}