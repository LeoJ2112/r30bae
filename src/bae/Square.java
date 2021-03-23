package bae;


//Add Phidgets Library
import com.phidget22.*;

public class Square {
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
        leftMotors.open(5000);
        rightMotors.open(5000);
        sonar.open(5000);

        int count = 0;

        while (true) {
            if (sonar.getDistance() < 300){
                Thread.sleep(1000);
                leftMotors.setTargetVelocity(1);
                rightMotors.setTargetVelocity(-1);
                Thread.sleep(890);
                leftMotors.setTargetVelocity(0);
                rightMotors.setTargetVelocity(0);
                Thread.sleep(1000);
            }
            else{
                leftMotors.setTargetVelocity(0.5);
                rightMotors.setTargetVelocity(0.5);
                if (count == 8) {
                    leftMotors.setTargetVelocity(0);
                    rightMotors.setTargetVelocity(0);
                    Thread.sleep(1000);
                    leftMotors.setTargetVelocity(1);
                    rightMotors.setTargetVelocity(-1);
                    Thread.sleep(610);
                    leftMotors.setTargetVelocity(0);
                    rightMotors.setTargetVelocity(0);
                    Thread.sleep(1000);
                    count = 0;
                }

            }


            count++;
            Thread.sleep(250);
        }


    }
}
