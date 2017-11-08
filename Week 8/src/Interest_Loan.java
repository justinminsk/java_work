import java.util.Scanner;

public class Interest_Loan {
public static void main(String[] args){
	double IR, MP, TP, Payment, stuff, otherstuff;
	int years;
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter loan amount: ");
	TP = scan.nextDouble();
	System.out.println("Eneter loan period in years: ");
	years = scan.nextInt();
	System.out.println("Loan Amount: "+TP);
	Payment= TP;
	System.out.println("Interest Rate	Monthly Payment		Total Payment");
	for(IR = 2.5; IR <= 8; IR+=0.125){
		//compond interest used 
		stuff = 1+(IR*0.01)/(12);
		otherstuff = 12*years;
		Payment += TP*Math.pow(stuff, otherstuff);
		MP = Payment-TP;
		System.out.println(IR+"%		"+MP+"		  "+Payment);
	}
}
}
