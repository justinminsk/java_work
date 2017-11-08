/**
 * 
 * @author justin minsk
 * @version [3/1/2017]
 * show two numbers before, during, and after a method that switches them without return
 * 
 * 
 *
 */
public class TestPassByValue {
  /** Main method */ 
	 public static void main(String[] args) {
		  // Declare and initialize variables 
		  int num1 = 1; 
		   int num2 = 2; 
		   //display numbers
		    System.out.println("Before invoking the swap method, num1 is " +  num1 + " and num2 is " + num2); 
		    
		     // Invoke the swap method to attempt to swap two variables 
		     swap(num1, num2); 
		     //display after the method numbers
		     System.out.println("After invoking the swap method, num1 is " +  num1 + " and num2 is " + num2); 
		      } 
	  /** Swap two variables */ 
	 //set up void method
	  public static void swap(int n1, int n2) { 
		  //display what happens before swaping
		   System.out.println("\tInside the swap method"); 
		    System.out.println("\t\tBefore swapping, n1 is " + n1  + " and n2 is " + n2);
		    
		    // Swap n1 with n2 
		     int temp = n1; 
		     n1 = n2; 
		      n2 = temp; 
		      //display what happens after swaping
		      System.out.println("\t\tAfter swapping, n1 is " + n1  + " and n2 is " + n2); 
		       } 
	   }
	 
