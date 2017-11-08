import java.util.Scanner;

public class CalcTestGrade {
public static void main(String[] args){
	Scanner input =new Scanner(System.in);
	System.out.print("How many questions where there total : ");
	double total =input.nextInt();
	System.out.print("How many questions did you get correct : ");
	double correct = input.nextInt();
	System.out.println("Your precent right is " +correct/total+ "% anyhting belowe .85 is failing.");
}
}