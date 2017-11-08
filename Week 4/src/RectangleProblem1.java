/**
 * @author Justin Minsk
 * @version [2/1/2017]
 * find if a point is inside of a rectangles area
 * 
 * set up 2 scanners
 * boolean z = false
 * ask for x
 * double x is user input
 * ask for y
 * double y is user input
 * if -5<=x<=5
 * z= true
 * else 
 * z= false
 * if -2.5<=y>=2.5
 * z= true
 * else 
 * z= false
 * if z =ture
 * yes (x,y) is in the rectangle
 * else 
 * no (x,y) is not in the rectangle
*/
import java.util.Scanner;

public class RectangleProblem1 {
public static void main(String[] args){
	Scanner scan= new Scanner(System.in);
	Scanner scan2 = new Scanner(System.in);
	boolean z = false;
	System.out.println("What is your x?");
	double x = scan.nextDouble();
	System.out.println("What is your y?");
	double y = scan2.nextDouble();
	if (x<=5 && x>=-5){
		z=true;
	}
	else {
		z=false;
	}
	if (y<=2.5 && y>=-2.5){
		z=true;
	}
	else {
		z=false;
	}
	if (z==true){
		System.out.println("Yes, (" +x+","+y+") is in the rectangle!");
	}
	else{
		System.out.println("No, (" +x+","+y+") is not in the rectangle!");
	}
}
}
