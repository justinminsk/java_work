import java.util.Scanner;

public class compareStrings {
public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter sentence 1");
	String sent1 = scan.nextLine();
	System.out.println("Enter sentence 2");
	String sent2 = scan.nextLine();
	if (sent1.compareTo(sent2) == 0){
		System.out.println("They are the same sentance");
	}
	else{
		System.out.println("they are not the same sentence");
	}
	System.out.println("Type a letter");
	String an1 = scan.nextLine();
	char an1C = an1.charAt(0);
	System.out.println("Type a letter");
	String an2 = scan.nextLine();
	char an2C = an2.charAt(0);
	if (an1C == an2C)
		System.out.println("the same letter");
	else
		System.out.println("not the same letter");
}
}
