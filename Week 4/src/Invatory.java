import java.util.Scanner;

public class Invatory {
public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	Scanner scan2 = new Scanner(System.in);
	Scanner scan3 = new Scanner(System.in);
	Scanner scan4 = new Scanner(System.in);
	System.out.println("Beginning inventory value?");
	double begInv = scan.nextDouble();
	double store1=begInv;
	double store2=begInv;
	double store3=begInv;
	System.out.println("Number of widgets sold at Store 1?");
	double sold = scan2.nextDouble();
	store1=store1-sold;
	System.out.println("Number of widgets sold at Store 2?");
	sold= scan3.nextDouble();
	store2=store2-sold;
	System.out.println("Number of widgets sold at Store 3?");
	sold =scan4.nextDouble();
	store3=store3-sold;
	System.out.println("Store 1 "+store1+" Store 2 "+store2+" Store 3 "+store3);
}
}
