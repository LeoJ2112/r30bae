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
        // create objects
        World world = new World(300, 300);
        Turtle firstInitial = new Turtle(100, 30, world);
        Turtle secondInitial = new Turtle(150, 30, world);

        // move firstInitial turtle
        firstInitial.backward(200);
        firstInitial.turnLeft();
        firstInitial.forward(50);
        firstInitial.turnRight();
        firstInitial.forward(75);

        // move secondInitial turtle
        secondInitial.turnRight();
        secondInitial.forward(100);
        secondInitial.turnRight();
        secondInitial.forward(50);

    }
}
