import java.util.Scanner;

public class TripAndVacation {
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("What was the total costumer : ");
	double total = input.nextInt();
	System.out.println("Your total tip : " +total*0.15+ " Total bill : " +total*1.15);
}
}
