package stringsDemo;
import java.util.*;
public class Texttonum {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);){
			System.out.println("Enter Textto convert");
			String st = sc.nextLine().trim().toUpperCase()
						.replaceAll("[ABC]","2")
						.replaceAll("[DEF]","3").replaceAll("[GHI]","4")
						.replaceAll("[JKL]","5").replaceAll("[MNO]","6")
						.replaceAll("[PQRS]","7").replaceAll("[TUV]","8")
						.replaceAll("[WXYZ]", "9");
			System.out.println(st);
		}
	}

}
