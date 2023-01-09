package p1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Employee {
	public TechSkills ob = null;
	String Name,Desg,Branch,Empid;
	public Employee(TechSkills ob)
	{
		this.ob = ob;
	}
	public void setData(Scanner sc)
	{
		System.out.println("Enter Name:");
		Name = sc.nextLine();
		System.out.println("Enter Desg: ");
		Desg = sc.nextLine();
		System.out.println("Enter Branch: ");
		Branch = sc.nextLine();
		System.out.println("Enter Empid: ");
		Empid = sc.nextLine();
		System.out.println("Enter BackEndLang: ");
		ob.BE_lang = sc.nextLine();
		System.out.println("Enter FrondEnd Langs: ");
		ob.FE_lang = sc.nextLine();
		System.out.println("Enter Tools: ");
		ob.Tools = sc.nextLine();
	}
	public void getData()
	{
		StringTokenizer st = null;
		System.out.println("Name: "+ Name);
		System.out.println("Desg: "+Desg);
		System.out.println("Branch: "+Branch);
		System.out.println("Empid: "+Empid);
		st = new StringTokenizer(ob.BE_lang,",");
		int i=1;
		System.out.println("Backend Languages: ");
		while(st.hasMoreElements())
		{
			System.out.println(i++ +"."+st.nextToken());
		}
		i=1;
		st = new StringTokenizer(ob.FE_lang,",");
		System.out.println("Frontend Languages: ");
		while(st.hasMoreElements())
		{
			System.out.println(i++ +"."+st.nextToken());
		}
		i=1;
		st = new StringTokenizer(ob.Tools,",");
		System.out.println("Tools: ");
		while(st.hasMoreElements())
		{
			System.out.println(i++ +"."+st.nextToken());
		}}}
