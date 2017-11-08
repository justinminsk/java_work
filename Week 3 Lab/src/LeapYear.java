/**Leap Year finder
 * 
 * 1/27/2017
 * 
 * Justin Minsk
 * 
 * user enter n for year
 * y is a boolean that is n%4==0 && n%100!=0 || n%400==0
 * if y is ture it is a leap year
 * else it is not
 */
import java.util.Scanner;

public class LeapYear {
public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter Year : ");
	int n=scan.nextInt();
	boolean y = (n % 4 == 0);
	y= y && (n% 100 != 0);
	y= y || (n % 400 ==0);
	if (y==true){
		System.out.println(n+" is a leap year.");
	}
	if (y==false){
		System.out.println(n+ " is not a leap year.");
	}
	
}
}
