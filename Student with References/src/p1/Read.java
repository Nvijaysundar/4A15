package p1;

import java.util.Scanner;
public class Read {
	public Read(Student st,Scanner sc)
	{
		System.out.println("Enter Name: ");
		st.Name = sc.nextLine();
		System.out.println("Enter Rollno: ");
		st.Rollno = Long.parseLong(sc.nextLine());
		System.out.println("Enter Branch: ");
		st.Branch = sc.nextLine();
		System.out.println("ENter Phno: ");
		st.c.phno = Long.parseLong(sc.nextLine());
		Boolean b = true;
		while(b)
		{
			System.out.println("Enter Emaild: ");
			st.c.emailid = sc.nextLine();
			if(st.c.emailid.contains("@")&&st.c.emailid.contains("."))
				b= false;
			else
				System.out.println("Enter Valid Emaild");
		}
		for(int i=1,sub;i<=6;i++)
		{
			System.out.println("Enter Sub"+i+" marks: ");
			sub = Integer.parseInt(sc.nextLine());
			st.m.totalmarks += sub;
			if(sub<40)
				st.m.failsub++;
		}
		System.out.println("Enter Hno: ");
		st.ad.Hno = sc.nextLine();
		System.out.println("Enter Stname: ");
		st.ad.stname = sc.nextLine();
		System.out.println("Enter CIty: ");
		st.ad.city = sc.nextLine();
		System.out.println("Enter Pincode: ");
		st.ad.pincode= Integer.parseInt(sc.nextLine());
	}
}
