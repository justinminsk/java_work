
public class Activity5redo {
public static void main(String[] args){
	double x=5.0;
	double y=4.0;
	double z=3.0;
	double m=2.0;
	double n=1.0;
	double seconds=365.0*24.0*60.0*60.0;
			double death=seconds/13;
			double birth=seconds/7;
			double forign=seconds/45;
			double startnumber=312032486;
			System.out.println("Year 5");
			System.out.println(startnumber-death*x+birth*x+forign*x);
			System.out.println("Year 4");
			System.out.println(startnumber-death*y+birth*y+forign*y);
			System.out.println("Year 3");
			System.out.println(startnumber-death*z+birth*z+forign*z);
			System.out.println("Year 2");
			System.out.println(startnumber-death*m+birth*m+forign*m);
			System.out.println("Year 1");
			System.out.println(startnumber+(-death+birth+forign)*n);
			System.out.println("Year 0");
			System.out.println(startnumber+(-death+birth+forign)*0);
}
}
