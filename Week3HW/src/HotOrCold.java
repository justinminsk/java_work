import java.util.Scanner;

public class HotOrCold {
public static void main(String[] args){
Scanner scan = new Scanner(System.in);
System.out.print("What is your Fahrenheit?");
double Fahrenheit = scan.nextDouble();
double Celsius= (5.0/9.0)*(Fahrenheit-32.0);
System.out.println("Your Fahrenheit "+Fahrenheit+" is eqaul to "+Celsius+" Celsius");
if (Celsius >= 14){
	System.out.println("That's Hot!");
}
else {
	System.out.println("That's Cold!");
}
}
}
