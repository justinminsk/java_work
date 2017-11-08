/**
 * @author Justin Minsk
 * @version [2/1/2017]
 * state if a fraction is improper or not if it is show the mixed fraction 
 * if not restate fraction
 * 
 * set 2 scanners
 * display what is numerator
 * int num user input
 * display what is denominator
 * int den user input
 * if num/den!=0
 * (within)if num%den!=0
 * 			x=num-(num%den)*den
 * 			num/den is an improper fraction and can be reduced to x+num/den+den
 * (within)if num%den == 0
 * 			num/den is an improper fraction and can be reduced to num/den
 * else
 * num/den is a proper fraction
 */
import java.util.Scanner;

public class Fractions {
public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	Scanner scan2 = new Scanner(System.in);
	System.out.println("What is your numerator?");
	int num = scan.nextInt();
	System.out.println("What is your denominator?");
	int den = scan2.nextInt();
	if (num/den!=0){
		if (num%den!=0){
		int x=num-(num%den)*den;
		System.out.println(num+"/"+den+" is an improper fraction and it can be reduced to "+x+"+"+num/den+"/"+den);
	}
		if (num%den==0){
			System.out.println(num+"/"+den+" is an improper fraction and it can be reduced to "+num/den);
		}
	}
	else{
		System.out.println(num+"/"+den+" is a proper fraction");
	}
}
}
