import java.util.Scanner;

public class Act7 {
	public static void main(String[] args){ 
		int numPets1; 
		int numPets2; 
		int total;   
		Scanner scan = new Scanner(System.in); 
		System.out.println("How many pets do you own?"); 
		numPets1 = scan.nextInt(); 
		System.out.print("How many pets does your partner own?"); 
		numPets2 = scan.nextInt();    
		total = numPets1 + numPets2;   
		System.out.println("Together, you both have " + total + " pets");    
} 
	} 