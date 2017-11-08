import java.util.Scanner;

public class inv2 {
public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	Scanner scan2 = new Scanner(System.in);
	Scanner scan3 = new Scanner(System.in);
	Scanner scan4 = new Scanner(System.in);
	double payPer = 15.00;
	System.out.println("Beginning inventory value?");
	double begInv = scan.nextDouble();
	double store1=begInv;
	double store2=begInv;
	double store3=begInv;
	System.out.println("Number of widgets sold at Store 1?");
	double sold = scan2.nextDouble();
	store1=store1-sold;
	double store1Pay= sold*payPer;
	System.out.println("Number of widgets sold at Store 2?");
	sold= scan3.nextDouble();
	store2=store2-sold;
	double store2Pay=sold*payPer;
	System.out.println("Number of widgets sold at Store 3?");
	sold =scan4.nextDouble();
	store3=store3-sold;
	double store3Pay=sold*payPer;
	if (store1Pay+store2Pay+store3Pay>2000){
		System.out.println(store1Pay+store2Pay+store3Pay-2000+" is your commison");
	}
	else{
		System.out.println("No commison");
	}
	System.out.println("Store 1 "+store1+" Store 2 "+store2+" Store 3 "+store3);
}
}
