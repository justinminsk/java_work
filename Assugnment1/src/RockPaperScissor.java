/**
 * @author Justin Minsk
 * @version [2/1/2017]
 * Rock Paper and Scissors 
 * is played with the computer using random numbers for the 
 * Computers choices
 */
import java.util.Scanner;

public class RockPaperScissor {
public static void main(String[] args){
	Scanner scan1 = new Scanner(System.in);
	System.out.println("Choose Rock, Paper or Scissor");
	System.out.println("using the nymbers in the ()");
	System.out.println("Rock (1)");
	System.out.println("Paper (2)");
	System.out.println("Scissor (3)");
	//player picking rock paper or scissors
	int choice = scan1.nextInt();
	//Computer picking rock paper or scissors
	int CPUChoice = (int)(Math.random()*(3-1)+1);
	//if statements that make up every choice possible
	if (choice == 1 && CPUChoice == 3){
		System.out.println(" ");
		System.out.println("Rock beats Scissor you WIN!");
	}
	if (choice == 2 && CPUChoice == 1){
		System.out.println(" ");
		System.out.println("Paper beats Rock you WIN!");
	}
	if (choice == 3 && CPUChoice == 2){
		System.out.println(" ");
		System.out.println("Scissor beats Paper you WIN!");
	}
	if (choice ==  CPUChoice){
		System.out.println(" ");
		System.out.println("Tie Game!");
	}
	if (choice == 1 && CPUChoice == 2){
		System.out.println(" ");
		System.out.println("Paper beats Rock you LOSE!");
	}
	if (choice == 2 && CPUChoice == 3){
		System.out.println(" ");
		System.out.println("Scissor beats Paper you LOSE!");
	}
	if (choice == 3 && CPUChoice == 1){
		System.out.println(" ");
		System.out.println("Rock beats Scissor you LOSE!");
	}
}
}