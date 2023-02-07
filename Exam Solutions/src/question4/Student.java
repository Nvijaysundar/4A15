package question4;
import java.util.Scanner;
public class Student {
	String Sno,sname,div;
	int daa,java,maths,cn,os,tm;
	float per;
	 void inputdata(Scanner sc)
	 {
		System.out.println("ENter Sno:");
		Sno = sc.nextLine();
		System.out.println("Enter sname: ");
		sname = sc.nextLine();
		System.out.println("Enter Div: ");
		div = sc.nextLine();
		System.out.println("Enter Daa Mrks");
		daa= Integer.parseInt(sc.nextLine());
		System.out.println("Enter Java Mrks");
		java = Integer.parseInt(sc.nextLine());
		System.out.println("Enter maths Mrks");
		maths =Integer.parseInt(sc.nextLine());
		System.out.println("Enter cn Mrks");
		cn = Integer.parseInt(sc.nextLine());
		System.out.println("Enter os Mrks");
		os = Integer.parseInt(sc.nextLine());
	 }
	 void calculateMarks()
	 {
		 tm = daa+java+maths+cn+os;
		 per = tm/5.0f;
	 }
	 void output()
	 {
		 System.out.println("Name: "+sname);
		 System.out.println("No: "+Sno);
		 System.out.println("Div: "+div);
		 System.out.println("TMarks: "+tm);
		 System.out.println("Per: "+per);
	 }
	 public static void main(String[] args) {
		Student s = new Student();
		s.inputdata(new Scanner(System.in));
		s.calculateMarks();
		s.output();	
	}
}
