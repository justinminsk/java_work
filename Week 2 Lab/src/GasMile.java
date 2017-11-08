import java.util.Scanner;

public class GasMile {
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("How many miles did you drive : ");
	double mile = input.nextInt();
	System.out.print("How much gas was used : ");
	double gas = input.nextInt();
	System.out.println("Your miles per gallon are "+gas/mile);
}
}
