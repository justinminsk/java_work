import java.util.Scanner;

public class CalcGrossPay {
public static void main(String[] args){
Scanner scan= new Scanner(System.in);
System.out.println("How many hours did you work?");
int hours = scan.nextInt();
Scanner scan2 = new Scanner(System.in);
System.out.println("How much do you get paud er hour?");
int payRate = scan2.nextInt();
int grossPay= payRate*hours;
System.out.println(grossPay);
}
}