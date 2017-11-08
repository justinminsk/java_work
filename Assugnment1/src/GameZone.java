/**
 * @author Justin Minsk
 * @version [2/1/2017]
 * Table 10
 * Game Zone
 * this will allow you to pick between games 
 * each one will have their own comments on what they do in the code
 * before it starts 
 */
import java.util.Scanner;

public class GameZone {
public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	System.out.println("Welcome to GAME ZONE!!");
	System.out.println(" ");
	System.out.println("Pick a game using the number in () by the game name");
	System.out.println("(1) Rock Paper Scissors");
	System.out.println("(2) Guessing Game");
	System.out.println("(3) Calculator Game");
	System.out.println("(4) Chose your own Adventure Game");
	System.out.println("(5) Quit");
	System.out.println(" ");
	int game = scan.nextInt();
	if (game==1){
		/**
		 * @author Justin Minsk
		 * @version [2/1/2017]
		 * Rock Paper and Scissors 
		 * is played with the computer using random numbers for the 
		 * Computers choices
		 */
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
	if (game==2){
		/**
		 * @author Justin Minsk
		 * @version [2/1/2017]
		 * Guessing Game
		 * a simple game that lets the player pick number 1-10
		 * and see if it matches the computer 
		 * who has a random number generator 
		 * with whole number integers 1-10
		 * Then tells the player if they got the right answer or not.
		 */
		Scanner scan2 = new Scanner(System.in);
		//Creating the computers number 1-10
		int CPUNumber = (int)(Math.random()*(10-1)+1);
		System.out.println("Welcome to the guessing game!");
		System.out.println(" ");
		System.out.println("Guess a number 1-10!");
		System.out.println(" ");
		//players input 1-10
		int guess = scan2.nextInt();
		//if statements that state if the player guessed the number correctly
		if (CPUNumber == guess){
			System.out.println(" ");
			System.out.println("You guessed the number "+CPUNumber+" !!!!");
		}
		else{
			System.out.println(" ");
			System.out.println("You guessed wrong, the number was "+CPUNumber);
		}
	}
	if (game==3){
		/**
		 * @author Justin Minsk
		 * @verison [2/1/2017]
		 * Calculator Game
		 * Lets player enter x and y integers
		 * then gives them a list of operations to chose from (1-5)
		 * then depending on what they pick operates on x and y
		 * by the operation and tells the player what it is doing
		 * and then the outcome
		 */
		Scanner scan3 = new Scanner(System.in);
		Scanner scan4 = new Scanner(System.in);
		Scanner scan5 = new Scanner(System.in);
		System.out.println("Welcome to the Calculator Game!");
		System.out.println("Give an interger x!");
		//gets x value
		int x = scan3.nextInt();
		System.out.println("Give an interger y!");
		//gets y value
		int y = scan4.nextInt();
		System.out.println("Pick an operation from the list using the numbers!");
		System.out.println("(1) Add");
		System.out.println("(2) Subtract");
		System.out.println("(3) Mutiply");
		System.out.println("(4) Divide");
		System.out.println("(5) Mean");
		//lets player pick operation
		int z = scan5.nextInt();
		//reads the players response and then comes out 
		//with what it is doing and operation 
		if (z == 1){
			System.out.println(x+" + "+y+" is eqaul to " +(x+y));
		}
		if (z == 2){
			System.out.println(x+" - "+y+" is eqaul to " +(x-y));
		}
		if (z == 3){
			System.out.println(x+" * "+y+" is eqaul to " +(x*y));
		}
		if (z == 4){
			System.out.println(x+" / "+y+" is eqaul to " +(x/y));
			System.out.println("with a remainder of " +(x%y));
		}
		if (z == 5){
			System.out.println("The mean of " +x+ " and " +y+ " is eqaul to " +((x+y)/2));
		}
	}
	if (game==4){
		/**
		 * @author Justin Minsk
		 * @version [2/1/2017]
		 * Chose your own Adventure
		 * asks for a series of responses from the player 
		 * some ending in glory 
		 * others in death 
		 */
		Scanner scan6 = new Scanner(System.in);
		Scanner scan7 = new Scanner(System.in);
		Scanner scan8 = new Scanner(System.in);
		System.out.println("Welcome to chose your own adventure: Troll Cave");
		System.out.println("");
		System.out.println("pick response with the corrisponding numbers (1),(2),(3),etc.");
		System.out.println(" ");
		System.out.println("You are an adventurer of great renown");
		System.out.println("You have heard about the great troll that dewells by the town of Phage");
		System.out.println("Do you decide to (1) Go to the town or (2) stay home?");
		//first choice 
		int a = scan6.nextInt();
		if (a==1){
			System.out.println("You decide to go to the town");
			System.out.println("As you get into town you notice the town empty");
			System.out.println("it seems like everyone either left or has been taken to the troll cave");
			System.out.println("Do you (1) go after the troll in his cave or (2) run away?");
			//second choice
			a= scan7.nextInt();
			if (a==1){
				System.out.println("You go to the troll cave");
				System.out.println("The cave is surronded by half eaten cows and sheep");
				System.out.println("you also suspect other things in the remains");
				System.out.println("You hear a defining roar");
				System.out.println("Do you (1) run straight in (2) run away or (3) hide?");
				//third choice
				a= scan8.nextInt();
				if(a==1){
					System.out.println("You run in sheild and sword at the ready");
					System.out.println("You get in a big fight with the troll");
					System.out.println("After what felt like an entirenty you win slayer the troll!!");
					System.out.println(" ");
					System.out.println("Congratz you have finished the game successfully !!");
				}
				//if you decided to hide if expanded could be used multiple times
				if(a==3){
					System.out.println("You do not notice how sneaky the troll is");
					System.out.println("The troll sneaks up behind you and before you know it you are lunch.");
					System.out.println(" ");
					System.out.println("Retry to see different options");
				}
			}
		}
		//if you decide not to fight with silly ending
		if(a==2){
			System.out.println("You go home a coward");
			System.out.println("A bookshelf falls on you and you die");
			System.out.println(" ");
			System.out.println("Retry to see different options");
		}
	}
	if (game==5){
		System.out.println(" ");
		System.out.println("Goodbye, see you soon!");
	}
	}
}
