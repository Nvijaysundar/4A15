package p2;
import java.util.Scanner;

import p1.Inout;
public class Main {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int size = sc.nextInt();
		Inout[] emp  = new Inout[size];
		for(int i=0;i<size;i++)
		{
			emp[i]= new Inout();
		}
		for(Inout k : emp)
			k.output();
		sc.close();
	}
}
