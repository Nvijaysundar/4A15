package temp;
public class Iclass implements Itest2 {
	public void m1()
	{
		System.out.println("This is m1 Method");
	}
	public void m2(int x)
	{
		System.out.println("This m2 method "+x);
	}
	public static void main(String[] args) {
		new Iclass().m1();
		new Iclass().m2(456);
	}
}
