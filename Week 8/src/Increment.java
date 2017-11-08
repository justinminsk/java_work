/**
 * 
 * @author justin minsk
 * @version [3/1/2017]
 * shows n before during and after a method
 * 
 *
 */
public class Increment {
	public static void main(String[] args) {
		//declare x
		int x = 1;
		//display x
		System.out.println("Before the call, x is " + x);
		//call method with x
		increment(x);
		//display x
		System.out.println("After the call, x is " + x);
	}
//create method
	public static void increment(int n) {
		//add one to n
		n++;
		//display n
		System.out.println("n inside the method is " + n);
	}
}
