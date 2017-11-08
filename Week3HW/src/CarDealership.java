import java.util.Scanner;

public class CarDealership {
public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	System.out.println("Car model?");
	int CarModel = scan.nextInt();
	Scanner scan2 = new Scanner(System.in);
	System.out.println("Initial cost?");
	double InitalCost = scan2.nextDouble();
	double SalesTax = InitalCost*0.036;
	double Discount = InitalCost*0.15;
	double FinalCost= InitalCost + SalesTax - Discount;
	double Commission= FinalCost*0.1;
	System.out.println("Car Model : "+CarModel);
	System.out.println("InitalCost : "+InitalCost);
	System.out.println("Sales tax : "+SalesTax);
	System.out.println("Discount : "+Discount);
	System.out.println("Final cost : "+FinalCost);
	System.out.println(" ");
	System.out.println(" ");
	System.out.println(" ");
	System.out.println(" ");
	System.out.println(Commission);
}
}