package p1;

public class Withdraw implements Transaction {
	public boolean process(float amt)
	{
		if(hunmul(amt))
		{
			if(avil(amt))
			{
				if(mimiamt(amt))
				{
					Balance.bal -= amt;
					System.out.println("Withdraw SuccessFul");
					Transaction.b.getBal();
					return false;
				}
				else
				{
					System.out.println("Minimum bal should be Main"
							+ "ed is Rs.500/-");
					return true;
				}
			}
			else
			{
				System.out.println("Insufficient funds in account");
				return true;
			}
		}
		else
		{
			System.out.println("Invalid Format");
			return true;
		}
	}

	private boolean mimiamt(float amt) {
			if(Balance.bal-amt>=500f)
				return true;				
		return false;
	}

	private boolean avil(float amt) {
			if(amt<Balance.bal)
				return true; 
		return false;
	}

	private boolean hunmul(float amt) {
			if(amt%100==0)
				return true;
		return false;
	}
}
