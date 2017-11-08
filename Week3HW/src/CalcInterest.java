import java.util.Scanner;

public class CalcInterest {
public static void main(String[] args){
	Scanner scan= new Scanner(System.in);
	System.out.print("What is your current balance?");
	double balance= scan.nextDouble();
	System.out.print("What is the interest rate?");
	double InterestRate = scan.nextDouble();
	double interest= balance*(InterestRate/1200);
	System.out.println("Your intrest is "+interest);
}
}
