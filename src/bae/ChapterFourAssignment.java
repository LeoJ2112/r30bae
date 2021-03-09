// Joel Bae
// Groundhog Day
// Mar 9 2021

// by now you should know the drill about this statement
package bae;

import java.awt.*;
import java.util.Scanner;
import turtles.*;

public class ChapterFourAssignment {
    // ask the user for an integer between 0 and 100
    // loop through from 0 to that number.  Print the number and if it is even or odd for each round

    private static void oddOrEven(Scanner scan){
        // input of integer
        System.out.println("Input an integer between 0 and 100");
        int response = scan.nextInt();

        // check if response is greater or less than 0
        if (response >= 0 && response <= 100) {

            // print int and parity
            for (int i = 0; i <= response; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is even");
                } else {
                    System.out.println(i + " is odd");
                }
            }
        }

        // recall the function
        else{
            System.out.println("Please input a number between 0 and 100");
            oddOrEven(scan);
        }
    }

    // ask the user for the dimensions of their box
    // print a box of those dimensions made of *
    private static void boxes(Scanner scan){

        // input of width and length
        System.out.println("Input the width of your box");
        int width = scan.nextInt();
        System.out.println("Input the length of your box");
        int length = scan.nextInt();

        // print *'s to form box
        for (int i = 0; i < width; i++){
            for (int j = 0; j < length; j++){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }

    // ask the user how many sides the regular polygon should have as well as how long the sides should be
    // use turtles and loops to draw the polygon
    private static void turtlePolygon(World world, Scanner scan){

        // create turtle object
        Turtle turtle = new Turtle(800, 450, world);
        turtle.hide();
        turtle.setColor(Color.green);

        // input number of sides and length
        System.out.println("Input the number of sides for your polygon");
        int sides = scan.nextInt();
        System.out.println("Input the length of each side");
        int length = scan.nextInt();

        // determine angle of normal polygon
        double angle = (double) (360)/sides;

        // draw polygon
        for (int i = 0; i < sides; i++){
            turtle.turn(angle);
            turtle.forward(length);
            // print error message and restart if side length is too long
            if (turtle.getXPos() > 1600 || turtle.getXPos() < 0 || turtle.getYPos() < 0 || turtle.getYPos() > 800){
                System.out.println("ERROR: The length is too long! Input a shorter length");
                world.remove(turtle);
                turtlePolygon(world, scan);
                break;

            }
        }
    }

    // test your code here
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        World world = new World(1600, 900);

        oddOrEven(scan);
        System.out.println();

        boxes(scan);
        System.out.println();

        turtlePolygon(world, scan);
        System.out.println();
    }
}
