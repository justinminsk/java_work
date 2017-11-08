import java.util.Scanner;

public class LabQuestion8 {

	public static void main(String[] args) {
		
		//---- Declare all the variables here
		int choice = 0, num = 0;
		double total = 0;
		Scanner scan= new Scanner(System.in);
		final double tax = .023;
		Scanner scan2=new Scanner(System.in);
		
		//-----------------------------------
		
		
		System.out.println("Please select 1 of the following options to buy: ");
		System.out.println("1. Shirts (7$ / item)");
		System.out.println("2. Pants  (10$ / item)");
		System.out.println("3. Top    (5$ / item)");
		choice = scan.nextInt();
		//On the next line, write the code to scan an integer called choice. Use the necessary input
		//
		if(choice == 1)
		{
			System.out.println("How many shirts do you want?");
			int x=scan2.nextInt();
			total=7*x;
			System.out.println("Your total is "+7*x);
			//Here, ask the user how many shirts they would like to buy. Based on that quantity and the price per shirt, calculate the total.
			//
			
		}
		else if(choice == 2)
		{
			System.out.println("How many pants do you want?");
			int x=scan2.nextInt();
			total=10*x;
			System.out.println("Your total is "+10*x);
			//Here, ask the user how many pants they would like to buy. Based on that quantity and the price per pants, calculate the total.	
			//
		}
		else if(choice == 3)
		{
			System.out.println("How many tops do you want?");
			int x=scan2.nextInt();
			total=5*x;
			System.out.println("Your total is "+5*x);
			//Here, ask the user how many top they would like to buy. Based on that quantity and the price per top, calculate the total.
			//
		}	
		total = total + total * tax; //
		
		System.out.println("Hello Customer, Thank you for your purchase at our store.");
		// below, write the code to print the total bill
		System.out.println("Your total bill was : "+total);
		
	}

}
