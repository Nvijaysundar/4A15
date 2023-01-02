package p1;
public class Charlie {
	static //static block
	{
		System.out.println("THis is Static block");
	}
	{//instance block
		System.out.println("Instance Block");
	}
	Charlie()
	{
		System.out.println("This con");
	}
	public static void main(String[] args) {
		Charlie ob = new Charlie();
		System.out.println("Hello");
	}}
