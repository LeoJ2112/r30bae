package bae;

import com.phidget22.DCMotor;
import com.phidget22.DistanceSensor;
import com.phidget22.Net;

public class StraightAhead {
    public static void main(String[] args) throws Exception {

        //Connect to wireless rover
        Net.addServer("", "192.168.100.1", 5661, "", 0);

        //Create
        DCMotor leftMotors = new DCMotor();
        DCMotor rightMotors = new DCMotor();
        DistanceSensor sonar = new DistanceSensor();

        //Address
        leftMotors.setChannel(0);
        rightMotors.setChannel(1);

        //Open
        leftMotors.open(2000);
        rightMotors.open(2000);
        sonar.open(2000);


        System.out.println("This will move left motor, and then right motor, and then both motors to move straight ahead.");
        Thread.sleep(2000);

        // move left motors
        System.out.println("Left!");
        leftMotors.setTargetVelocity(1);
        Thread.sleep(1000);

        leftMotors.setTargetVelocity(0);
        Thread.sleep(1500);

        // move right motors
        System.out.println("Right!");
        rightMotors.setTargetVelocity(1);
        Thread.sleep(1000);

        rightMotors.setTargetVelocity(0);
        Thread.sleep(1500);

        while(true) {

            // drive straight ahead every two seconds by moving both motors forward
            System.out.println("Both!");
            leftMotors.setTargetVelocity(1);
            rightMotors.setTargetVelocity(1);
            Thread.sleep(650);
            leftMotors.setTargetVelocity(0);
            rightMotors.setTargetVelocity(0);
            Thread.sleep(2000);
        }
    }
}
