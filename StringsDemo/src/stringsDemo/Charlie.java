package stringsDemo;
import java.util.*;
public class Charlie {

	public static void main(String[] args) {
	String str = "Charlie";
	String str2 = "Aplha";
	str = str.concat(str2);
	System.out.println("Lenght: "+ str.length());
	for(int i=0;i<str.length();i++)
		System.out.print(str.charAt(i)+ " ");
	System.out.println();
	System.out.println(str.toString());
	}

}
