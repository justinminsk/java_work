import java.util.Scanner;

public class use_their_Sentance {
public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	String sent1 = ("The trouble with programmers is that you can never tell what a programmer is doing until it’s too late.");
	int sent1L = sent1.length();
	System.out.println(sent1L);
	System.out.println("type in some letters");
	String an1S = scan.nextLine();
	System.out.println(sent1.contains(an1S));
	System.out.println("Type a letter");
	String an1 = scan.nextLine();
	char an1C = an1.charAt(0);
	System.out.println(sent1.indexOf(an1C));
	System.out.println("eneter an index number");
	int indexNum = scan.nextInt();
	System.out.println(sent1.charAt(indexNum));
	String trouble = "trouble";
	String beforeT = "The ";
	String afterT = " with programmers is that you can never tell what a programmer is doing until it’s too late.";
	System.out.println(beforeT+trouble.toUpperCase()+afterT);
	String author = " - Seymour Cray";
	System.out.println(sent1.concat(author));
}
}
