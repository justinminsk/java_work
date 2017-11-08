import java.util.Scanner;

public class overtime {
public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	Scanner scan2 = new Scanner(System.in);
	Scanner scan4 = new Scanner(System.in);
	Scanner scan5 = new Scanner(System.in);
	System.out.println("Regular Wage?");
	double regularWage= scan.nextDouble();
	System.out.println("Regular Hours?");
	double regularHour = scan2.nextDouble();
	double overtimeWage, overtimeHours;
	if (regularHour>40){
		overtimeHours= regularHour-40;
		regularHour=40;
		overtimeWage=regularWage*1.5;
	}
	else{
		overtimeHours=0;
		overtimeWage=0;
	}
	double totalPay= overtimeHours*overtimeWage+regularWage*regularHour;
	System.out.println(totalPay);
}
}
