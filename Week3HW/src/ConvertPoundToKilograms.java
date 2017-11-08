import java.util.Scanner;
public class ConvertPoundToKilograms {
public static void main(String[] args){
Scanner scan = new Scanner(System.in);
System.out.print("Enter pounds : ");
double pounds = scan.nextDouble();
double kilograms= pounds*0.454;
System.out.println(pounds+" pounds is eqaul to "+kilograms);
}
}
