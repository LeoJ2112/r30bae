// Joel Bae
// Who Want's to Be a Millionaire?
// Date completed

// by now you should know the drill about this statement
package bae;

import java.util.Locale;
import java.util.Scanner;

public class ChapterThreeAssignment {
    // make your quiz inside the main method
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int points = 0;

        // first question(numerical)
        System.out.println("How many centimeters are there in one meter?");
        int intResponse = scan.nextInt();
        int intAnswer = 100;
        if (intResponse == intAnswer){
            System.out.println("Correct!");
            points++;
        }
        else{
            System.out.println("Incorrect...");
        }

        // second question(multiple choice)
        System.out.println("Where is the United States of America located?");
        System.out.println("1. South America \n2. Chile \n3. Nebraska \n4. Under Canada " );
        intResponse = scan.nextInt();
        intAnswer = 4;
        if (intResponse == intAnswer){
            System.out.println("Correct!");
            points++;
        }
        else{
            System.out.println("Incorrect...");
        }

        // third question(numerical)
        System.out.println("How many em's are in eminem?");
        intResponse = scan.nextInt();
        intAnswer = 2;
        if (intResponse == intAnswer){
            System.out.println("Correct!");
            points++;
        }
        else{
            System.out.println("Incorrect...");
        }

        // fourth question(String)
        System.out.println("February 12 is Abe Lincoln's birth___");
        String stringResponse = scan.next();
        String stringAnswer = "day";
        if (stringResponse.equalsIgnoreCase(stringAnswer)){
            System.out.println("Correct!");
            points++;
        }
        else{
            System.out.println("Incorrect...");
        }

        // fifth question(String)
        System.out.println("Cows go ___");
        stringResponse = scan.next();
        stringAnswer = "moo";
        if (stringResponse.equalsIgnoreCase(stringAnswer)){
            System.out.println("Correct!");
            points++;
        }
        else{
            System.out.println("Incorrect...");
        }
        System.out.println("You got " + (double) (points)/5 * 100 + " percent");
    }
}
