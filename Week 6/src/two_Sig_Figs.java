import java.util.Scanner;

public class two_Sig_Figs {
public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	System.out.println("enter a number");
	double x= scan.nextDouble();
	System.out.println("enter a second number");
	double y = scan.nextDouble();
	double z = x/y;
	System.out.printf("x/y is %4.2f" ,z);
}
}
