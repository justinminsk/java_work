import java.util.Scanner;

public class Vacation {
public static void main(String [] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter number of days of vaction : ");
		int days = input.nextInt();
		int weeks= days/7;
		int RemainDays= days%7;
		System.out.println("Total number of weeks : " +weeks+ " Total numbers of days : " +RemainDays);
}
}
