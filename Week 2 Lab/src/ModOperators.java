import java.util.Scanner;
//% for remainder / for division 

public class ModOperators {
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter x : ");
	int x = input.nextInt();
	System.out.print("Enter y : ");
	int y = input.nextInt();
	System.out.println("Your answer for x/y in whole real numbers is " +x/y+ ". Your remainder is " +x%y);
}
}
//can not divide by zero on the last data set (7,0), 
//we can fix that by giving stipulations of what x and y can be