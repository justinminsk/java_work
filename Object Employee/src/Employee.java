
public class Employee {
	private String name;
	//creates name variable 
	private int age;
	//creates age variable
	private final int ID;
	//create ID variable
	private double salary;
	//creates salary variable
	private String department;
	//creates department variable
	public Employee(String n, int a, int id, double s, String dept) {
		//makes an employee object
		name = n;
		age = a;
		ID = id;
		salary = s;
		department = dept;
	}

	public void setSalary(double newSalary) {
		//changes salary
		salary = newSalary;
	}

	public String toString() {
		//makes a string with all the information
		return name + "( " + ID + ") " + " is " + age + " years old and earn " + salary + " working for " + department;
	}

	public double getSalary() {
		//returns salary from the object
		return salary;
	}

	public String getName() {
		//returns name form the object
		return name;
	}

	public int compareTo(Employee other) {
		//compares two salary's
		if (this.salary > other.salary)
			return 1;
		else if (this.salary < other.salary)
			return -1;
		else
			return 0;
	}

}

