// Name: Joshua Francis
// Course: CSC 135
// Project: Problem_2_2
// File Name: Hundreds.java

// This function takes two inputs from the user, displays the numbers, 
// the hundreds place, and adds the hundreds place together.
import java.util.Scanner;                                                       // Imports the scanner object that listens to the input of the user.

public class Hundreds {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);                                  // Creates a scanner object that listens to the inputs of the user.

        int firstValue;                                                         // Tells the program that the input for the variable 'firstValue' it is accepted as an integer.
        int secondValue;                                                        // Tells the program that the input for the variable 'secondValue' it is accepted as an integer.
        int firstHundreds;                                                      // Tells the program that the variable 'firstHundreds' is a integer.
        int secondHundreds;                                                     // Tells the program that the variable 'secondHundreds' is a integer.
        int sum;

        System.out.println("Enter the first integer (Between 100 and 9999): "); // Where the user inputs the first integer and where the next line of code scans
        firstValue = scan.nextInt();                                            // Scans the input on the line where the above print statement is

        System.out.println("Enter the second integer (Between 100 and 9999): ");// Where the user inputs the second integer and where the next line of code scans
        secondValue = scan.nextInt();                                           // Scans the input on the line where the above print statement is

        firstHundreds = ((firstValue / 100) % 10);                              //Grabs the hundreds position from the 'firstValue' and stores it as 'firstHundreds'
        secondHundreds = ((secondValue / 100) % 10);                            //Grabs the hundreds position from the 'secondValue' and stores it as 'secondHundreds'

        System.out.println("The hundereds position from " //Print statement that prints the first integer and its respective number at the hundreds position
                + firstValue + " is " + firstHundreds + ".");

        System.out.println("The hundereds position from " //Print statement that prints the second integer and its respective number at the hundreds position
                + secondValue + " is " + secondHundreds + ".");

        sum = firstHundreds + secondHundreds;                                   //Defines 'sum' as the addition of the hundreds positions from both inputted integers.
        System.out.println(sum);                                                //Prints the sum of of the hundreds positions from both of the inputted integers.

    }

}
