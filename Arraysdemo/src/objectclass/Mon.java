package objectclass;
public class Mon {

	public static void main(String[] args) {
	Object[] ob = new Object[3];
	
	ob[0] = new String("Java");
	ob[1] = new Integer("1");
	ob[2] = new Employee("XYZ","Clerk",2564f);
	
	System.out.println(ob[0]);
	System.out.println(ob[1]);
	((Employee) ob[2]).getData();
	}

}
