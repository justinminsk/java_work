import java.util.Scanner;

/**
 * @author Justin Minsk
 * @version [2/1/2017]
 * Chose your own Adventure
 * asks for a series of responses from the player 
 * some ending in glory 
 * others in death 
 */
public class ChoseYourOwnAdventure {
public static void main(String[] args){
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
	//if you decide not to fight with ironic ending
	if(a==2){
		System.out.println("You go home a coward");
		System.out.println("A bookshelf falls on you and you die");
		System.out.println(" ");
		System.out.println("Retry to see different options");
	}
}
}
