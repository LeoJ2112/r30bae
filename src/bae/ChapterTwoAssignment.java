// Joel Bae
// Turtles All The Way Down
// Date completed

// remember to change this to your last name to match your package
package bae;

// if you set up turtles properly, this should work; it should turn from grey to blue when you make a turtle
import turtles.*;

public class ChapterTwoAssignment {
    // put your code here to draw your first and last inintial, each with a different turtle
    // don't forget to measure the final distance between the turtles
    public static void main(String[] args) {
        // create turtle objects for initials
        World world = new World(300, 300);
        Turtle firstInitial = new Turtle(100, 30, world);
        Turtle secondInitial = new Turtle(150, 30, world);
        firstInitial.hide();
        secondInitial.hide();

        // move firstInitial turtle to write J
        firstInitial.backward(200);

        firstInitial.turnLeft();
        firstInitial.forward(75);

        firstInitial.turnRight();
        firstInitial.forward(75);

        firstInitial.turnRight();
        firstInitial.forward(20);

        firstInitial.turnRight();
        firstInitial.forward(40);

        firstInitial.turnLeft();
        firstInitial.forward(20);

        firstInitial.turnLeft();
        firstInitial.forward(165);

        firstInitial.turnRight();
        firstInitial.forward(35);

        // move secondInitial turtle to write B
        secondInitial.turnRight();
        secondInitial.forward(100);

        secondInitial.turnRight();
        secondInitial.forward(100);

        secondInitial.turnRight();
        secondInitial.forward(50);

        secondInitial.backward(75);
        secondInitial.turnLeft();

        secondInitial.forward(100);
        secondInitial.turnRight();

        secondInitial.forward(125);
        secondInitial.turnRight();

        secondInitial.forward(200);

        // draw inside boxes for B
        secondInitial.penUp();
        secondInitial.moveTo(180, 50);
        secondInitial.penDown();

        for (int i = 0; i < 4; i++){
            secondInitial.turnRight();
            secondInitial.forward(50);
        }

        secondInitial.penUp();

        secondInitial.moveTo(190, 150);
        secondInitial.penDown();
        for (int i = 0; i < 4; i++) {
            secondInitial.turnRight();
            secondInitial.forward(50);
        }

        // get distance between turtle objects
        double distance = firstInitial.getDistance(secondInitial.getXPos(), secondInitial.getYPos());
        System.out.println("The distance between the two turtles is: " + distance);
    }
}
