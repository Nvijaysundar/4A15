package onedimen;
import java.util.*;
public class Assignment {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No of elements:");
		int size = sc.nextInt(),sume=0,sumo=0,max=0,val=0,cnt=0;
		boolean flag = true;
		int[] arr = new int[size];
		int[] temp = new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
			if(arr[i]%2==0)
				sume += arr[i];
			if(i%2==1)
				sumo += arr[i];
		}
		Arrays.sort(arr);
		for(int i = 0;i<size;i++)
		{
			cnt=0;
			for(int j=0;j<size;j++)
			{
				if(arr[i]==arr[j])
					cnt++;
			}
			if(cnt>max) {
			max = cnt;
			val = arr[i];	
			}
			
		}
		System.out.println("Greatest: "+arr[arr.length-1]);
		System.out.println("Smallest: "+arr[0]);
		System.out.println("sum of even : "+ sume);
		System.out.println("Sum of odd index: "+ sumo);
		if(max==1)
			System.out.println("Not present");
		else
		System.out.println("max freq: "+max + " element: "+val);

		
	}

}
