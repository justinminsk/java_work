import java.util.Scanner;

public class Nostaliga {
public static void mina(String[] args){
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter how many times you want Welcome to Java tor run: ");
	int javaInt = scan.nextInt();
	while (javaInt > 0){
		System.out.println("Welcome to Java");
		javaInt--;
	}
}
}
