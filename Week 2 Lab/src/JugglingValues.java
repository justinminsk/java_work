import java.util.Scanner;

public class JugglingValues {
public static void main(String[] args){
 Scanner input = new Scanner(System.in);
System.out.print("Enter X : ");	
int x = input.nextInt();
System.out.print("Enter Y : ");
int y = input.nextInt();
int z = y;
//make third box and make it y
y=x;
//move our x to y
x=z;
//move our z to x
System.out.println("X : "+x+" Y : "+y);
}
}
