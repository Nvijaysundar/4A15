package p1;
public class A { 
	public static void m1()
	{
		System.out.println("This is m1 With no parameters");
	}
	
	public static void m1(int x)
	{
		m1();
		System.out.println("THis is m1 with one parameter");
		System.out.println("X : "+x);
	}
	public static void m1(int x,int y)
	{
		m1(x);
		System.out.println("THis is m1 with two parameters");
		System.out.println("X : "+x);
		System.out.println("Y : "+y);
	}
}
