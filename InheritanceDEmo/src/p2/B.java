package p2;
public class B extends A {
	public B(int x,int y, int z)
	{
		super(x, y);
		System.out.println("THis is Con with three parameters");
		System.out.println("X : "+x);
		System.out.println("Y : "+y);
		System.out.println("Z : "+z);
		
	}
	public B(int x,int y, int z,int a)
	{
		this(x, y, z);
		System.out.println("THis is Con with four parameters");
		System.out.println("X : "+x);
		System.out.println("Y : "+y);
		System.out.println("Z : "+z);
		System.out.println("a : "+a);
	}
	public static void main(String[] args) {
		new B(1,2,3,4);
	}
}
