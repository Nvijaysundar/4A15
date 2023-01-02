package p1;
import java.util.*;
public class Uglynumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N Value: ");
		int n = sc.nextInt();
		int c =1,k=2;
		if(n==1)
		{
			System.out.println("Nth Ugly number: "+(k-1));
		}
		else if(n>1)
		{
			while(c<=n)
			{
				if(k%2==0 || k%3==0 || k%5==0)
				{
					c++;
				}
				k++;
			}
			System.out.println("Nth Ugly number: "+(k-1));
		}
		else
			System.out.println("Invalid Input");
		sc.close();
	}

}
