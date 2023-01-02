package stringtokenizer;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Ross {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringTokenizer ob = new StringTokenizer(sc.nextLine());
		while(ob.hasMoreElements())
		{
			System.out.println(new StringBuffer(ob.nextToken()).reverse());
		}
	}
}
