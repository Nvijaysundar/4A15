package p1;
public class Student {
	String Name;
	long Rollno;
	public Student (String Name,long Rollno)
	{
		this.Name = Name;
		this.Rollno = Rollno;
	}
	public void GetData()
	{
		System.out.println("Name: "+ Name);
		System.out.println("Rollno: "+Rollno);
	}	
}
