
/**
 * @author justin minsk
 * @version [4/24/2017]
 * Assignment 4
 * 
 * __Description__
 * Use linear and binary search to find the index of an array and use that index to find title of book and price. Use bubble and selection sort to sort a list of 1000 elements form 1-500.
 * 
 * Set up the three  matrixes for the searches. Set up the inputs and variables needed for time and choice. 
 * Do- 
 * set the time variables to 0. Display the menu. Get an input from the user. 
 * if 1-
 * display method using the three book arrays 
 * display  pick book array and take input from user as ID
 * take time before search
 * linearSearch method using bookID and ID
 * take time right after
 * take time after minus time before 
 * display bookID, title, amount bought, and the total
 * display run time of the search
 * if 2-
 * same as one but use binarySearch method instead of linearSearch method
 * if 3- 
 * create random array and display it unsorted
 * take time before sort 
 * bubbleSort method to sort
 * take time after and take time after minus time before
 * display sorted array
 * display runtime of the sort
 * if 4-
 * same as above but use selectionSort method instead of bubbleSort
 * if 5-
 * display good bye
 * if not 1-5-
 * display invalid choice
 * -while choice is not 5
 * __display method__
 * display the three book arrays in a table
 * __linearSearch method__
 * run through each array element and compare it to what you are searching for
 * display index if the element you are looking for does not exist return -1
 * __binarySearch method__
 * have high be last index and low be 0
 * while low is less than or equal to high mid is equal to high - low /2
 * if array at mid index is the searched for element return it else
 * if array at index mid is higher than search element take high and -1 else take low and add 1
 * repeat until element is found or return -1
 * __bubbleSort method__
 * compare each element to the element in an array moving the higher of the two to the right
 * after highest is found no longer look at that element
 * re[eat until list is sorted
 * __selectionSort method__
 * looks at first element it compares it to the others storing the lowest
 * after the list is went through and the min is found it get put in the lowest index searched
 * repeat removing one element form the left each time until list is sorted
 * __createArray method__
 * returns a 1000 int array with each element a random number 1-500
 * 
 */

import java.util.Scanner;

public class Assignment_4 {
	public static void main(String[] args) {
		//create scanner
		Scanner input = new Scanner(System.in);
		//make title array
		String[] bookTitle = { "Starting out with Java", "Java Programming", "Software Structures",
				"Design and Analysis of Algorithms", "Computer Graphics", "Artificial Intelligence: A Modern Approach",
				"Probability and Statistics", "Cognitive Science", "Modern Information Retrieval",
				"Speech and Language Processing" };
		//make id array
		int[] bookID = { 1101, 1211, 1333, 1456, 1567, 1642, 1699, 1755, 1800, 1999 };
		//make price array
		double[] bookPrice = { 112.32, 73.25, 54.00, 67.32, 135.00, 173.22, 120.00, 42.25, 32.11, 123.75 };
		//set up variables 
		int choice = 0, ID = 0, amount = 0;
		double price = 0, time = 0, Mtime = 0, runTime = 0;
		do {
			//set time to 0 and display menu
			time = 0;
			Mtime = 0;
			runTime = 0;
			System.out.println("__Menu__");
			System.out.println("(1) Linear Search");
			System.out.println("(2) Binary Search");
			System.out.println("(3) Bubble Sort");
			System.out.println("(4) Selection Sort");
			System.out.println("(5) Quit");
			//take user input
			choice = input.nextInt();
			if (choice == 1) {
				do {
					//display the table 
					display(bookID, bookPrice, bookTitle);
					//ask for a book id
					System.out.println("pick book with book ID");
					ID = input.nextInt();
					//search for book id
					if (linear_search(bookID, ID) != -1) {
						//time before
						time = (double) (System.nanoTime() / 1000000000.0);
						//price found with linear search
						price = bookPrice[linear_search(bookID, ID)];
						//time after
						Mtime = (double) (System.nanoTime() / 1000000000.0);
						//runtime
						runTime = (Mtime - time);
						//takes amount
						System.out.println("Enter amount");
						amount = input.nextInt();
						//displays information 
						System.out.println("book ID: " + bookID[linear_search(bookID, ID)]);
						System.out.println("book Title: " + bookTitle[linear_search(bookID, ID)]);
						System.out.println("Amount bought: " + amount);
						System.out.println("Total is: " + (price * amount));
						System.out.println(" ");
						System.out.println("Run-time of operation: " + (runTime));
						//if it is not a vaild id
					} else
						System.out.println("invaild ID");
				} while (linear_search(bookID, ID) == -1);
			}
			if (choice == 2) {
				do {
					//display table
					display(bookID, bookPrice, bookTitle);
					//ask for id
					System.out.println("pick book with book ID");
					ID = input.nextInt();
					//search for id and make sure it is valid
					if (binary_search(bookID, ID) != -1) {
						//time before
						time = (double) (System.nanoTime() / 1000000000.0);
						//price at index using binary search
						price = bookPrice[binary_search(bookID, ID)];
						//time after
						Mtime = (double) (System.nanoTime() / 1000000000.0);
						//runtime
						runTime = (Mtime - time);
						//ask for amount
						System.out.println("Enter amount");
						amount = input.nextInt();
						//display information 
						System.out.println("book ID: " + bookID[binary_search(bookID, ID)]);
						System.out.println("book Title: " + bookTitle[binary_search(bookID, ID)]);
						System.out.println("Amount bought: " + amount);
						System.out.println("Total is: " + (price * amount));
						System.out.println(" ");
						System.out.println("Run-time of operation: " + (runTime));
						//if invalid id
					} else
						System.out.println("invaild ID");
				} while (binary_search(bookID, ID) == -1);
			}
			if (choice == 3) {
				//create and display unsorted array
				System.out.println("The unsorted array is: ");
				int[] array = createArray();
				for (int i = 0; i < 250; i++)
					System.out.print(array[i] + "  ");
				System.out.println(" ");
				for (int i = 250; i < 500; i++)
					System.out.print(array[i] + "  ");
				System.out.println(" ");
				for (int i = 500; i < 750; i++)
					System.out.print(array[i] + "  ");
				System.out.println(" ");
				for (int i = 750; i < 1000; i++)
					System.out.print(array[i] + "  ");
				System.out.println(" ");
				//time before
				time = (double) (System.nanoTime() / 1000000000.0);
				//sort array using bubble search
				bubbleSort(array);
				//time after
				Mtime = (double) (System.nanoTime() / 1000000000.0);
				//run time
				runTime = (Mtime - time);
				// display sorted array
				System.out.println("The sorted array is: ");
				for (int i = 0; i < 250; i++)
					System.out.print(array[i] + "  ");
				System.out.println(" ");
				for (int i = 250; i < 500; i++)
					System.out.print(array[i] + "  ");
				System.out.println(" ");
				for (int i = 500; i < 750; i++)
					System.out.print(array[i] + "  ");
				System.out.println(" ");
				for (int i = 750; i < 1000; i++)
					System.out.print(array[i] + "  ");
				System.out.println(" ");
				//display runtime
				System.out.println("Run-time of operation: " + (runTime));
			}
			if (choice == 4) {
				//create and display unsorted array
				System.out.println("The unsorted array is: ");
				int[] array = createArray();
				for (int i = 0; i < 250; i++)
					System.out.print(array[i] + "  ");
				System.out.println(" ");
				for (int i = 250; i < 500; i++)
					System.out.print(array[i] + "  ");
				System.out.println(" ");
				for (int i = 500; i < 750; i++)
					System.out.print(array[i] + "  ");
				System.out.println(" ");
				for (int i = 750; i < 1000; i++)
					System.out.print(array[i] + "  ");
				System.out.println(" ");
				//time before
				time = (double) (System.nanoTime() / 1000000000.0);
				//sort array with selection sort
				selectionSort(array);
				//time after
				Mtime = (double) (System.nanoTime() / 1000000000.0);
				//runtime 
				runTime = (Mtime - time);
				//display sorted array
				System.out.println("The sorted array is: ");
				for (int i = 0; i < 250; i++)
					System.out.print(array[i] + "  ");
				System.out.println(" ");
				for (int i = 250; i < 500; i++)
					System.out.print(array[i] + "  ");
				System.out.println(" ");
				for (int i = 500; i < 750; i++)
					System.out.print(array[i] + "  ");
				System.out.println(" ");
				for (int i = 750; i < 1000; i++)
					System.out.print(array[i] + "  ");
				System.out.println(" ");
				//display runtime
				System.out.println("Run-time of operation: " + (runTime));
			}
			//display good bye message 
			if (choice == 5)
				System.out.println("Good bye");
			//if choice is not 1-5
			if (choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 5)
				System.out.println("Invaild choice");
			//end program 
		} while (choice != 5);
	}

	public static void display(int[] array, double[] price, String[] title) {
		//top line of table 
		System.out.println("book ID			book Price	book Title");
		//prints each line of table
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + "			" + price[i] + "		" + title[i]);
		}
	}

	public static int linear_search(int[] array, int n) {
		//count and index set
		int count = 0, index = -1;
		//looks at all elements of array
		for (int i = 0; i < array.length; i++) {
			//if the array at index i has number n make index count
			if (array[i] == n)
				index = count;
			//add one to count
			count++;
		}
		//Return index
		return index;
	}

	public static int binary_search(int[] array, int n) {
		//set low, high, and mid 
		//high being highest index low being lowest
		int low = 0, high = array.length - 1, mid;
		//if low is less than or equal to high
		while (low <= high) {
			//make mid
			mid = (high + low) / 2;
			//if array at index mid is the number n
			//return mid if so
			if (array[mid] == n) {
				return mid;
				//if array at index mid is higher than n since anything above mid is too high
				//make high = mid -1
			} else if (array[mid] > n)
				high = mid - 1;
			//else low = mid +1 since anything below mid is to low
			else
				low = mid + 1;
		}
		return -1;
	}

	public static void bubbleSort(int[] array) {
		int n = array.length;
		int temp = 0;
		//look at all elements
		for (int i = 0; i < n; i++) {
			//look at elements 1 to n - i
			for (int j = 1; j < (n - i); j++) {
				//if element before element is greater switch positions
				if (array[j - 1] > array[j]) {
					temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
				}
			}
		}
	}

	public static void selectionSort(int[] array) {
		//look at all elements minus the last one
		for (int i = 0; i < array.length - 1; i++) {
			//min is index at i
			int min = array[i];
			int minIndex = i;
			for (int j = i + 1; j < array.length; j++) {
				//look through every element minus the i +1
				if (min > array[j]) {
					//change min if the min is greater than the element at j 
					min = array[j];
					//change index
					minIndex = j;
				}
			}
			//move index over to the right by one
			if (minIndex != i) {
				array[minIndex] = array[i];
				array[i] = min;
			}
		}
	}

	public static int[] createArray() {
		//set array and make its elements 1- 500 randomly 
		int[] array = new int[1000];
		for (int i = 0; i < 1000; i++) {
			array[i] = (int) (Math.random() * 499 + 1);
		}
		return array;
	}
}
