package onedimen;
import java.util.*;
public class Joey {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int size = sc.nextInt(),sum=0;
		int[] arr = new int[size];	
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		for(int i=0;i<arr.length;i++)
			System.out.println(i+" : "+arr[i]);
		Arrays.sort(arr);
		for( int k:arr)
			System.out.println(k);
		
		System.out.println("Sum:"+sum);
	}

}
