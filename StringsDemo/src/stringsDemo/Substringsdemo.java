package stringsDemo;
public class Substringsdemo {

	public static void main(String[] args) {
		String st = "Java Language";
		
		System.out.println(st.substring(5));
		System.out.println(st.substring(5, 9));
		System.out.println(st.contains("gua"));
		System.out.println(st.startsWith("J"));
		System.out.println(st.endsWith("a"));
		System.out.println(st.isEmpty());
		System.out.println(st.indexOf('a'));
		System.out.println(st.lastIndexOf('a'));
		System.out.println(st.isBlank());	
		
	}

}
