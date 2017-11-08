import java.util.Scanner;

/**
 * Loop Activity 2 - Assigned on Monday 02/20/2017
 *
 * Model II: Program #2 Specificiation
 * Create a Java program that displays a menu of your choice.
 * The menu has to have at least 4 options with the last one being the exit.
 * If the user enters a wrong option, the menu has to display
 * "Wrong Choice! Try Again!" and display the menu again.
 * When the user enters the right choice, the option needs to be processed.
 *
 */

public class LoopActivity2_withWhile {
  public static void main(String[] args){
    // Create Scanner
    Scanner input = new Scanner(System.in);

    // Display the menu
    // As per the instructions, it can be any menu of your choice
    System.out.println("Cafe Menu -------");
    System.out.println("A. Tea");
    System.out.println("B. Coffee");
    System.out.println("C. Cake");
    System.out.println("D. Exit");

    System.out.print("Enter your choice >> ");

    // Get user input
    char choice = input.next().charAt(0); // user charAt to convert to a character

    while(choice != 'A' && choice != 'B' && choice != 'C' && choice != 'D'){
      System.out.println("\nWrong Choice! Try Again!");

      // Have user enter choice again because they messed up the first time :)
      System.out.print("Enter your choice >> ");
      choice = input.next().charAt(0);
    }

    System.out.println(); // added just for output formatting

    // As per the instructions...
    // "When the user enters the right choice, the option needs to be processed"
    // Use if statements to process the user's decision
    if(choice == 'A'){
      System.out.println("Tea is good!");
    }
    else if (choice == 'B'){
      System.out.println("Yum, coffee!");
    }
    else if (choice == 'C'){
      System.out.println("Cake is delicious.");
    }
    else {
      System.out.println("Goodbye!");
    }


  } // end main
} // end class
