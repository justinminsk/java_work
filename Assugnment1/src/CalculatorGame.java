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

import java.util.Scanner;

public class CalculatorGame {
public static void main(String[] args){
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
}
