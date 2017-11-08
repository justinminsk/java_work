/**
 * 
 * @author Justin Minsk
 * @version [2/22/2017]
 * 
 * calculate distance 
 * 
 * set up scanner
 * ask for x1
 * x1 user input
 * ask for y1 
 * y1 user input
 * ask for x2
 * x2 user input
 * ask for y2
 * y2 user input
 * set distance as sqrt((x2-x1)(x2-x1)+(y2-y1)(y2-y1))
 * display your distance is distance
 *
 */
import java.util.Scanner;

public class Distance {
public static void main(String[] args){
	//set up scanner
	Scanner scan = new Scanner(System.in);
	//ask and declare variables 
	System.out.println("What is your first x value?");
	double x1 = scan.nextDouble();
	System.out.println("What is your first y value?");
	double y1 = scan.nextDouble();
	System.out.println("What is your second x value?");
	double x2 = scan.nextDouble();
	System.out.println("What is your second y value?");
	double y2 = scan.nextDouble();
	//create x and y to make Math.pow easier
	double x = x2-x1;
	double y = y2-y1;
	//find distance
	double distance = Math.sqrt(Math.pow(x, 2)+ Math.pow(y, 2));
	//give distance 
	System.out.println("The distance is "+distance);
}
}
