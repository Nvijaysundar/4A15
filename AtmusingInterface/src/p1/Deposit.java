package p1;

public class Deposit implements Transaction {
	public boolean process(float amt)
	{
		if(hunmul(amt))
		{
			if(mimamt(amt))
			{
				Balance.bal += amt;
				System.out.println("Deposit Successful");
				Transaction.b.getBal();
				return false;
			}
			else
			{
				System.out.println("Minimun amount to be "
						+ "deposited is Rs.500/-");
				return true;
			}
		}
		else
		{
			System.out.println("Invalid Amount Format");
			return true;
		}
	}

	private boolean mimamt(float amt) {
		if(amt>=500)
			return true;
		return false;
	}

	private boolean hunmul(float amt) {
		if(amt%100==0)
			return true;
		return false;
	}
}
