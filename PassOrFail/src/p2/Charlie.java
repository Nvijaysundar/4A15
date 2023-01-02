package p2;
import java.util.*;
import p1.*;
public class Charlie {
	/*
	{
		try(Scanner sc = new Scanner(System.in))
		{
			System.out.println("Enter Name");
			String name = sc.nextLine();
			System.out.println("Enter Rollno");
			long rollno = sc.nextLong();
			int mar,tmarks = 0,fcount=0;
			for(int i=1;i<=6;i++)
			{
				System.out.println("Enter sub"+i+" Marks:");
				mar = sc.nextInt();
				if(mar<40)
					fcount++;
				tmarks += mar;
			}
			Student st = new Student(name,rollno);
			Marks m = new Marks(tmarks,fcount);
			st.GetData();
			m.GetResult();
			st = null;
			m = null;
		}
	}*/
	public static void main(String[] args) {
		Charlie ob = new Charlie();
		System.out.println(ob);
	}
}
