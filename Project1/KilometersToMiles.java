import java.util.Scanner;

public class KilometersToMiles {
public static void main(String[] args) {
	int k;
			Scanner scan= new Scanner (System.in);
			System.out.println("Enter your KM/h : ");
			k=scan.nextInt();
			double KMtoM=k/0.621;
			System.out.println("Your Miles per hour : " +KMtoM );
			
}
}
