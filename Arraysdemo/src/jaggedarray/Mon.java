package jaggedarray;
public class Mon {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int[] arr2 = {555,66,55};
		
		int[][] arr3 = {arr,arr2};
		
		for(int a[]: arr3) {
			for(int k: a)
				System.out.print(k+" ");
			System.out.println();
		}
	}
}
