// Joel Bae
// Who Want's to Be a Millionaire?
// Mar 8

// by now you should know the drill about this statement
package bae;

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

        points += intCheck(intResponse, intAnswer);

        // second question(multiple choice)
        System.out.println("Where is the United States of America located?");
        System.out.println("1. South America \n2. Chile \n3. Nebraska \n4. Under Canada " );
        intResponse = scan.nextInt();
        intAnswer = 4;

        points += intCheck(intResponse, intAnswer);

        // third question(numerical)
        System.out.println("How many em's are in eminem?");
        intResponse = scan.nextInt();
        intAnswer = 2;

        points += intCheck(intResponse, intAnswer);

        // fourth question(String)
        System.out.println("February 12 is Abe Lincoln's birth___");
        String stringResponse = scan.next();
        String stringAnswer = "day";

        points += stringCheck(stringResponse, stringAnswer);

        // fifth question(String)
        System.out.println("Cows go ___");
        stringResponse = scan.next();
        stringAnswer = "moo";

        points += stringCheck(stringResponse, stringAnswer);

        // print percentage of correct answers
        System.out.println("You got " + (double) (points)/5 * 100 + " percent");
    }

    // method to check for int based questions
    public static int intCheck(int intResponse, int intAnswer){
        if (intResponse == intAnswer){
            System.out.println("Correct!");
            return 1;
        }
        else{
            System.out.println("Incorrect...");
            return 0;
        }
    }

    // method to check for string based question
    public static int stringCheck(String stringResponse, String stringAnswer){
        if (stringResponse.equalsIgnoreCase(stringAnswer)){
            System.out.println("Correct!");
            return 1;
        }
        else{
            System.out.println("Incorrect...");
            return 0;
        }
    }
}
