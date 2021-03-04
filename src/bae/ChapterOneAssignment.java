// Your name
// This assignment - what is it?
// Date completed

// Like, change the package to your last name already
package bae;


// Starter code for first assignment
public class ChapterOneAssignment {

    // This should print out "Luna's favourite subject is robotics" using the variables provided
    private static void partOne(){
        String name = "Luna";
        String subject = "robotics";
        System.out.println(name + "'s favourite subject is " + subject);
    }

    // This should print out "Liam's best sport is football.  His favourite team is the Bengals." using the variables provided
    private static void partTwo(){
        String name = "Liam";
        String sport = "football";
        String team = "Bengals";
        System.out.println(name + "'s best sport is " + sport + ". His favourite team is the " + team + ".");
    }

    // Fill this in to print out your name, favourite movie, and favourite book.
    private static void partThree(){
        String name = "Joel";
        String movie = "Whiplash";
        String book = "The Little Prince";
        System.out.println("My name is: " + name);
        System.out.println("My favourite movie is: " + movie);
        System.out.println("My favourite book is: " + book);
    }

    //  Complete the code to calculate and print how many months it would take to earn $600 if you make $40 a week.
    // Assume that there are four weeks in a month
    private static void partFour(){
        double goal = 600;
        double weeklyRate = 40;
        double numWeeks = 4;
        double numMonths = goal/(numWeeks*weeklyRate);
        System.out.println(numMonths);
    }

    // Write code to calulcate and print how many slurpees you can buy with $10 if each one costs $2.15
    private static void partFive(){
        // Your code should use the variables
        // money, pricePerSlurpee, numberOfSlurpees
        // and print out numberOfSlurpees
        double money = 10;
        double pricePerSlurpee = 2.15;
        int numberOfSlurpees = (int) (money/pricePerSlurpee);
        System.out.println(numberOfSlurpees);
    }

    // main class to run everything you completed
    public static void main(String[] args)
    {
        // As you are ready to test each section, uncomment it (get rid of the // in front of the line)

        partOne();
        System.out.println();

        partTwo();
        System.out.println();

        partThree();
        System.out.println();

        partFour();
        System.out.println();

        partFive();
        System.out.println();
    }
}

