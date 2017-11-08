/**Enter Code get Discount
 * 
 * 1/27/2017
 * 
 * @author Justin Minsk
 *
 *Scan 
 *x=input
 *set double y
 *if x is 2014
 *then 15% or y=.15
 *else if x is 2015
 *then 10% or y=.1
 *else if x is 2016
 *then 5% or y=.05
 *else
 *y= 0
 *your discount is y*100%
 */
import java.util.Scanner;

public class MemebrCode {
public static void main(String[] args){
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter Discount code : ");
	int x= scan.nextInt();
	double y;
	if (x==2014){
		y=0.15;
	}
	else if (x==2015){
		y=0.10;
	}
	else if (x==2016){
		y=0.05;
	}
	else{
		System.out.println("No Vaild Disocunt");
		y=0;
	}
	System.out.println(y*100+"% is your discount total");
	
}
}
