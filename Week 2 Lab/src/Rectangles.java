import java.util.Scanner;
//A program to help kids learn to find the area of a rectangle

public class Rectangles {
public static void main(String[] args){
System.out.println("Welcome to Geometry! This week we will learn how to find the area of rectangles.");
Scanner input =new Scanner(System.in);
System.out.print("Enter your length : ");
int length= input.nextInt();
System.out.print("Enter your height : ");
int height= input.nextInt();
System.out.println("Your area is "+height*length+ ". Which is found by multiplying your height by your length. Now you do it!");
System.out.println("Your perimeter is "+2*height+2*length+". Which is found by 2 times your length plus 2 times your height. Now you do it!");
}
}
