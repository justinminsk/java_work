import java.util.Scanner;

public class ChatBot1 {
public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	System.out.println("Chat with chat bot type exit to end");
	String input = scan.next();
	do{
	int answerNum = (int)(Math.random()*(5-1)+1);
	if (answerNum == 1)
		System.out.println("You suck!");
	if (answerNum == 2)
		System.out.println("Go away");
	if (answerNum == 3)
		System.out.println("What?");
	if (answerNum == 4)
		System.out.println("Why?");
	if (answerNum == 5)
		System.out.println("How?");
	}while(!(input = scan.next()).equals("exit"));
}
}
