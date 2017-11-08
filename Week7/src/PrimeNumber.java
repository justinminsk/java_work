/**
 *  
 * @author justin minsk
 *@version [2/22/2017]
 *give the first 50 prime numbers
 *
 *create the size of the list to be 50 with the final key word
 *make the number of numbers per a line 10
 *start the loop count with 0
 *start with the number 2 (first prime number)
 *as long as count is less then 50
 *make 2 prime by boolean is prime true
 *divisor = 2, divisor is <= number , add one to divisor after 
 *seeing if divisor is <= number
 *if number%divisor == 0
 *change isprime to false
 *break the loop
 *if is prime
 *count++
 *if count % number of lines == 0
 *print next line number
 *else 
 *print number plue a space
 *number plue one
 *
 */
public class PrimeNumber {
	  public static void main(String[] args) {
		  final int NUMBER_OF_PRIMES = 50; 
		  // Number of primes to display 4 final 
		  int NUMBER_OF_PRIMES_PER_LINE = 10;
		  // Display 10 per line 5
		  int count = 0;
		  // Count the number of prime numbers 
		  int number = 2;
		  // A number to be tested for primeness 
		  System.out.println("The first 50 prime numbers are \n");
		  // Repeatedly find prime numbers 
		  while (count < NUMBER_OF_PRIMES) {
// Assume the number is prime
			  boolean isPrime = true; 
			  // Is the current number prime?  
			   // Test whether number is prime
			   for (int divisor = 2; divisor <= number / 2; divisor++) {
				    if (number % divisor == 0) { 
					   // If true, number is not prime 
					    isPrime = false; 
					    // Set isPrime to false
					     break;
					     // Exit the for loop
					      } 
				     }  
			    // Display the prime number and increase the count
			    if (isPrime) { 
			    	count++; 
			    // Increase the count  
			    if (count % NUMBER_OF_PRIMES_PER_LINE == 0) { 
			    	 // Display the number and advance to the new line 
			    	 System.out.println(number);  
			    	}
			     else 
			    	 System.out.print(number + " ");
				   }
			    //Check if the next number is prime
			    number++;
			   }
	  }
 }
 
	