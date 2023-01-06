package p1;
import java.util.Scanner;
public class Inout {
	Employee e =null;
	Address ad = null;
	public Inout()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name: ");
		String N = sc.nextLine();
		System.out.println("Enter Desg: ");
		String D = sc.nextLine();
		System.out.println("ENter Bsal: ");
		float bsal = Float.parseFloat(sc.nextLine());
		System.out.println("Enter Hno:");
		String Hno = sc.nextLine();
		System.out.println("Eter Stname: ");
		String st = sc.nextLine();
		System.out.println("ENter City: ");
		String C = sc.nextLine();
		System.out.println("Enter Pin: ");
		int pin = Integer.parseInt(sc.nextLine());
		e = new Employee(N, D, bsal);
		ad = new Address(Hno, st, C, pin);
	}
	public void output()
	{
		e.getData();
		ad.getData();
	}
}
