package p1;

public class Classs {
	public Classs(int i) {
		System.out.println("I: "+i);
	}
	void m1()
	{
		System.out.println("This is m1 Method");
	}
	void m2()
	{
		System.out.println("THis is m2 methods");
	}
	public static void main(String[] args) {
		Classs ob = new Classs(100);
		ob.m1();
		ob.m2();
	}

}
