
public class OnlineStoreInfo {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("How many customers are you entering?");
		int numberOfCustomers = input.nextInt();
		String[] names = new String[numberOfCustomers];
		int[] ages = new int[numberOfCustomers];
		String[] favoriteItem = new String[numberOfCustomers];
		for (int i = 0; i < names.length; i++) {
			AddNames(names, i);
			AddAge(ages, i);
			AddFI(favoriteItem, i);
		}
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i] + " is " + ages[i] + " years old, and their favorite item is "
					+ favoriteItem[i] + ".");
		}
	}

	public static void AddNames(String[] name, int i) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Name for " + i);
		name[i] = input.nextLine();
	}

	public static void AddAge(int[] age, int i) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Age for " + i);
		age[i] = input.nextInt();
	}

	public static void AddFI(String[] favoriteItem, int i) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("favorite Item for " + i);
		favoriteItem[i] = input.nextLine();
	}
}
