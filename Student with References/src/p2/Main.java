package p2;
import p1.*;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in);){
		Student[] s = new Student[Integer.parseInt(sc.nextLine())]; 
		Read[] r = new Read[s.length];
		Out[] o = new Out[s.length];
		for(int i=0;i<s.length;i++)
		{
			s[i]= new Student(new Address(),new Contact(),new Marks());
			
		 r[i] = new Read(s[i], new Scanner(System.in));
		}
		for(int i=0;i<2;i++) {
			System.out.println("==================");
			o[i] = new Out(s[i]);
		}
		}
	}
}
