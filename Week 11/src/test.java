
public class test {
	public static boolean mystery3(int[] array, int key) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == key) {
				return true;
			}
		}
		return false;
	}
	 public static int mystery4(int[] a, int key) {
         int low = 0;
         int high = a.length -1;
         int mid;
         while (low<=high)
         {
             mid = (low+high) /2;
             if (a[mid] == key)
               return mid;  
             else if (a[mid] > key)
               high = mid -1;    
             else
               low = mid +1;
         }
         return -1;
     }

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
		System.out.println(mystery4(array, 5));

	}
}
