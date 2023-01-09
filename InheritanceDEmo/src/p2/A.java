package p2;
public class A { 
	public A()
	{
		System.out.println("This is Con With no parameters");
	}
	
	public A(int x)
	{
		this();
		System.out.println("THis is con with one parameter");
		System.out.println("X : "+x);
	}
	public A(int x,int y)
	{
		this(x);
		System.out.println("THis is con with two parameters");
		System.out.println("X : "+x);
		System.out.println("Y : "+y);
	}
}
