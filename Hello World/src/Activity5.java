import java.util.Scanner;

public class Activity5 {
public static void main(String[] args) {
	double seconds=365.0*24.0*60.0*60.0;
	double death=seconds/13;
	double birth=seconds/7;
	double forign=seconds/45;
	double startnumber=312032486;
	int year;
	Scanner scan= new Scanner(System.in);
	System.out.println("Year : ");
year= scan.nextInt();
double endpopulation=startnumber+(-death+birth+forign)*year;
System.out.println(endpopulation);



}
}
