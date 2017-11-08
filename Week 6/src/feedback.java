import java.util.Scanner;

public class feedback {
public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	System.out.println("Write a sentence then hit enter to submit");
	System.out.println("Up to five sentences ");
	System.out.println("Give feedback for TA's");
	String Sent1 = scan.nextLine();
	String Sent2 = scan.nextLine();
	String Sent3 = scan.nextLine();
	String Sent4 = scan.nextLine();
	String Sent5 = scan.nextLine();
	String Sent6= scan.nextLine();
	String AllSent= Sent1+" "+Sent2+" "+Sent3+" "+Sent4+" "+Sent5+" "+Sent6;
	System.out.println(AllSent);
	System.out.println(AllSent.charAt(0));
	int index = AllSent.length()-1;
	System.out.println(AllSent.charAt(index));
	System.out.println(AllSent.charAt(index/2));
}
}
