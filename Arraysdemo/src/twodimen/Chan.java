package twodimen;
import java.util.*;
public class Chan {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int row = sc.nextInt(),col = sc.nextInt();
	int[][] arr = new int[row][col];
	for(int i=0;i<row;i++)
		for(int j=0;j<col;j++)
			arr[i][j] = sc.nextInt();
	
	for(int i=0;i<row;i++) {
		for(int j=0;j<col;j++)
			System.out.print(arr[i][j]+" ");
		System.out.println();
	}
	for(int temp[] : arr)
	{
		for(int k : temp)
			System.out.println(k+" ");
		System.out.println();
	}
	}
	
	}


