package twodimen;
import java.util.*;
public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[][] arr = new int[size][size];
		for(int i =0;i<size;i++)
			for(int j=0;j<size;j++)
				arr[i][j] = sc.nextInt();
		for(int i[] : arr) {
			for(int j : i)
				System.out.print(j+" ");
			System.out.println();
		}
		System.out.println("Greatest");
		greatest(arr);
		System.out.println("lowest");
		lowest(arr);
		sumofb(arr);
		lowertraingular(arr);
		uppertraingular(arr);
		frwddiagonal(arr);
		bacdiagonal(arr);
	}
	private static void frwddiagonal(int[][] arr) {
		int sum=0;
		for(int i= 0;i<arr.length;i++)
			for(int j=0;j<arr[i].length;j++)
				if(i==j)
				sum += arr[i][j];
		System.out.println("frwd dai sum: "+sum);
		
	}

	private static void bacdiagonal(int[][] arr) {
		int sum=0;
		for(int i= 0;i<arr.length;i++)
			for(int j=0;j<arr[i].length;j++)
				if(i+j== arr.length-1)
				sum += arr[i][j];
		System.out.println("bck dai sum: "+sum);
	}

	private static void uppertraingular(int[][] up) {
		int sum=0;
		for(int i= 0;i<up.length;i++)
			for(int j=0;j<up[i].length;j++)
				if(j>=i)
				sum += up[i][j];
		System.out.println("upper traingular sum: "+sum);
		
	}

	private static void lowertraingular(int[][] lt) {
		int sum=0;
		for(int i= 0;i<lt.length;i++)
			for(int j=0;j<=i;j++)
				sum += lt[i][j];
		System.out.println("lower traingular sum: "+sum);
	}

	private static void sumofb(int[][] sob) {
	int sum=0;
	for(int i= 0;i<sob.length;i++)
		for(int j=0;j<sob[i].length;j++)
		{
			if(i==0||j==0||j==sob[i].length-1||i==sob.length-1)
				sum+= sob[i][j];
		}
	System.out.println("sum of boundaries: "+ sum);
	}

	private static void greatest(int[][] low) {
		for(int i=0;i<low.length;i++) {
			Arrays.sort(low[i]);
			System.out.println(low[i][low[i].length-1]);
		}
	}
	//verified
	private static void lowest(int[][] temp) {
		for(int i=0;i<temp.length;i++) {
			//Arrays.sort(temp[][i]);
			System.out.println(temp[temp.length-1][i]);
		}
	}

}
