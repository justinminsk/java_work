import java.util.Scanner;

public class User_Input_Wrong {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int input;
		do{
			System.out.println("Enter a number postive and not divisible by 10");
			 input = scan.nextInt();
		} while(input <= 0 || input%10 == 0);
		System.out.println("Wise choice");
		input-=2;
		System.out.println(input);
	}
	

}
