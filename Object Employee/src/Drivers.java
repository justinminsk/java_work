import java.util.Scanner;

public class Drivers {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter name");
		String name = scan.next();
		System.out.println("Enter age");
		int age = scan.nextInt();
		System.out.println("Enter ID");
		int ID = scan.nextInt();
		System.out.println("Enter Salary");
		double salary = scan.nextDouble();
		System.out.println("Enter deparment");
		String department = scan.next();
		Employee employee1 = new Employee(name, age, ID, salary, department);
		System.out.println(employee1.getName()+"’s salary is $"+employee1.getSalary());
		employee1.setSalary(90000);
		System.out.println(employee1.getName()+"’s salary is $"+employee1.getSalary());
		System.out.println(employee1.toString());
		Employee employee2 = new Employee("Bob", 25, 22345, 65000, "IT");
		System.out.println(employee2.toString());
		System.out.println(employee2.compareTo(employee1));
	}
	
}
