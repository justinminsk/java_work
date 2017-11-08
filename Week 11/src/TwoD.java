public class TwoD {
	public static void main(String[] args) {
		int i= 6; //(or any given number)
	    int j= 4; //(or any given number)
	    int[][]table= new int[i][j];
	    int[][] numbers = {{1,2,3},{4,5,6},{7,8,9}};
	for (int x=0; x < i; x++){
	    for (int y=0; y < j; y++)
	        table[x][y]=1;
	}
	    for (int x = 0; x < i; x++) {
	    for (int y = 0; y < j; y++) {
	       System.out.print(table[x][y]+" ");
	 }
	    System.out.println(" ");
		}
	    System.out.println(" ");
	    for (int x = 0; x < numbers.length; x++) {
		    for (int y = 0; y < numbers.length; y++) {
		       System.out.print(numbers[x][y]+" ");
		 }
		    System.out.println(" ");
			}
	}
}