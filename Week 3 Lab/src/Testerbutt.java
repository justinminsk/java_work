import java.util.Scanner;

public class Testerbutt {
public static void main(String[] args){
Scanner scan = new Scanner(System.in);
System.out.println("Y/N");
String butt = scan.nextLine();
char choice = butt.charAt(0);
if (choice == 'Y'){
	System.out.println("Good");
}
else {
	System.out.println("BAD");;
}
}
}
