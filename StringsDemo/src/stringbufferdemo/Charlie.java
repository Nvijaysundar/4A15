package stringbufferdemo;
public class Charlie {
	public static void main(String[] args) {
		String st = "Language";
		StringBuffer sb = new StringBuffer(st);
		System.out.println("Len: "+sb.length());
		System.out.println("Cap: "+sb.capacity());
		sb.append("Javaa");
		System.out.println("Len: "+sb.length());
		System.out.println("Cap: "+sb.capacity());
		
	}
}
