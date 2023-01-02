package p1;
public class Marks {
	int TotalMarks,Fcount;
	public Marks(int TotalMarks, int Fcount)
	{
		this.TotalMarks = TotalMarks;
		this.Fcount = Fcount;
	}
	public void GetResult()
	{
		System.out.println("PErcentage: "+ (TotalMarks/6.0F));
		if(Fcount==0)
			System.out.println("Pass");
		else
			System.err.println("FAIL");
	}
}
