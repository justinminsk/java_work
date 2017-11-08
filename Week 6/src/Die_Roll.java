
public class Die_Roll {
public static void main(String[] args){
	int roll1 = (int)(Math.random()*(6-1)+1);
	int roll2 = (int)(Math.random()*(6-1)+1);
	int roll3 = (int)(Math.random()*(6-1)+1);
	int roll4 = (int)(Math.random()*(6-1)+1);
	System.out.printf("%d\n%d\n%d\n%d\n", roll1, roll2, roll3, roll4);
}
}
