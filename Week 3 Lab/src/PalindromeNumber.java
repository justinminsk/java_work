/**
 * 
 * @author Justin Minsk
 *@version [2/1/2017]
 *finds if the number is a palindrome or not
 *
 *create Scanner 
 *declare int variable num
 * display and ask the user to enter a 3-digit integer 
 * declare int variable firstDigit 
 * firstDigit equals num / 100 
 *num equals num % 100 
 *num equals num % 10 
 * (num now represents the last digit) 
 * if firstDigit equals num, the original number is a palindrome  
 * display “This was a palindrome” 
 * else  
 *display “This was not a palindrome”
 */
import java.util.Scanner;

public class PalindromeNumber {
public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	int num;
	System.out.println("Enter a 3 digit interger : ");
	num = scan.nextInt();
	int firstDigit = num/100;
	num = num % 100;
	num = num % 10;
	if (firstDigit == num){
		System.out.println("this was a palindrome");
	}
	else {
		System.out.println("this was not a palindrome");
	}
}
}
