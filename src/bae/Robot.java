// Joel Bae
// Robot
// Date completed

// by now you should know the drill about this statement
package bae;

// Put your Robot stuff here
public class Robot {
    // name of robot
    private String name;
    // number of wheels for robot
    private int numWheels;
    // name of manufacturer of robot
    private String manufacturer;
    // the year the robot was made
    private int manufacturingYear;
    // position along the
    private int xPos;
    // amount of battery
    private double batteryPower;
    // number of lights on robot
    private int numLights;
    // colour of lights on robot
    private String colourOfLights;
    // lights on or off
    private boolean lightsOn;

    // set robot name
    public void setName(String name){

    }

    // set number of wheels on robot
    public void setNumWheels(int numWheels){

    }

    // set the manufacturer name
    public void setManufacturer(String manufacturer){

    }

    // set the year that the robot was made
    public void setManufacturingYear(int year){

    }

    // set the number of lights on robot
    public void setNumLights(int numLights){

    }

    // set colour of lights
    public void setColourOfLights(String colour){

    }

    // set lights on or off
    public void setLightsOn(boolean on){

    }

    // return the name of robot
    public String getName(){
        return name;
    }

    // return the number of wheels on robot
    public int getNumWheels(){
        return numWheels;
    }

    // return the manufacturer of robot
    public String getManufacturer(){
        return manufacturer;
    }

    // return the year the robot was made
    public int getManufacturingYear(){
        return manufacturingYear;
    }

    // return the position of robot
    public int getxPos(){
        return xPos;
    }

    // returns the amount of battery left
    public double getBatteryPower(){
        return batteryPower;
    }

    // move the robot at the given velocity for the given time
    public void velocityTimeMove(int velocity, int time){

    }

    // move the robot to given end point in given amount of time
    public void endPositionTimeMove(int endPos, int time){

    }

    // changes lightsOn to true or false at the given number of times it should flip
    public void flashLights(int times){

    }

    // detects the amount of battery left and sets batteryPower to the amount left
    public void updateBattery(){

    }
}
