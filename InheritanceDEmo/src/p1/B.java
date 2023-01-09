package p1;
public class B extends A {
	public static void m1(int x,int y, int z)
	{
		m1(x, y);
		System.out.println("THis is m1 with three parameters");
		System.out.println("X : "+x);
		System.out.println("Y : "+y);
		System.out.println("Z : "+z);
		
	}
	public static void m1(int x,int y, int z,int a)
	{
		m1(x, y, z);
		System.out.println("THis is m1 with four parameters");
		System.out.println("X : "+x);
		System.out.println("Y : "+y);
		System.out.println("Z : "+z);
		System.out.println("a : "+a);
	}
	public static void main(String[] args) {
		m1(1,2,3,4);
	}
}
