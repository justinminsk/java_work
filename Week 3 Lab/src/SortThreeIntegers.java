/**user enters two ints and the program finds int between the two
 * then orders them from smallest to largest
 * 1/27/2017
 * Justin Minsk
 * 
 * ask for x
 * user input x
 * ask for y
 * user input y
 * if y>x 
 * then m,z,n=x+random decimal
 * else  
 * m,z,n=y+random decimal
 * if statments to represent every variation of z,m,n
 * so that it orders them from least to greatest no matter 
 * the outcome of the random decimal 
 * display the z,m,n from least to greatest 
 */
import java.util.Scanner;

public class SortThreeIntegers {
public static void main(String[] args){
	Scanner scan= new Scanner(System.in);
	Scanner scan2= new Scanner(System.in);
	System.out.println("Enter interger one : ");
	int x=scan.nextInt();
	System.out.println("Enter interger two : ");
	int y= scan2.nextInt();
	double z, n, m;
	if (x>y){
		z=y+Math.random();
		n=y+Math.random();
		m=y+Math.random();
	}
	else{
		z=x+Math.random();
		n=x+Math.random();
		m=x+Math.random();
	}
	if (z>m && z>n && m>n){
	System.out.println(n+" , "+m+" , "+z);
	}
	else if (m>z && m>n && z>n){
		System.out.println(n+" , "+z+" , "+m);
		}
	else if (n>m && n>z && m>z){
		System.out.println(z+" , "+m+" , "+n);
		}
	else if (z>m && z>n && n>n){
		System.out.println(m+" , "+n+" , "+z);
		}
	else if (m>z && m>n && n>z){
		System.out.println(z+" , "+n+" , "+m);
		}
	else if (n>m && n>z && z>m){
		System.out.println(m+" , "+z+" , "+n);
		}
}
}
