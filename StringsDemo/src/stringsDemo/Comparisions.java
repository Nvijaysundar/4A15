package stringsDemo;
public class Comparisions {
	public static void main(String[] args) {
		String st = "Java";
		String str = "Java";
		String st2 = new String("Java");
		String st3 = new String("Java");
			System.out.println(st.equals(st2));
			System.out.println(st.equalsIgnoreCase(st2));
			System.out.println(st.compareTo(st2));
			System.out.println(st.compareToIgnoreCase(st2));
			if(st==str)
				System.out.println("Equals");
			else
				System.out.println("Not Equals");
			if(st2== st3)
				System.out.println("Equals");
			else
				System.out.println("Not Equals");
	}

}
