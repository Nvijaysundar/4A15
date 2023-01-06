package annonymousarray;

public class Ross {
	
	public static void main(String[] args) {
		sum(new int[] {1,3,4,6,7,8});
		mul(new int[][] {{1,2,3},{4,5,6}});
	}

	private static void mul(int[][] arr1) {
		int mul=1;
		for(int i[]:arr1)
			for(int j : i)
				mul *= j;
		System.out.println(mul);
	}

	static void sum(int[] arr) {
		int sum = 0;
		for(int i: arr)
			sum += i;
		System.out.println(sum);
	}
}
