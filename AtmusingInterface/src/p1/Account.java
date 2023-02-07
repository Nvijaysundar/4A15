package p1;

import java.util.Scanner;

public class Account {
	long accountno;
	String name;
	public void execution(Scanner sc ) {
		System.out.println("Enter Name: ");
		name = sc.nextLine();
		while(true) {
			System.out.println("Enter accountno: ");
			accountno = Long.parseLong(sc.nextLine());
			if(String.valueOf(accountno).length()==15)
				break;
			else
			{
				System.out.println("Enter Valid Account no");
			}
		}
		
		if(new Pinverify().pincheck(sc))
		{
			while(true)
			{
				System.out.println("Select Option\n1.Deposit\n2.Withdraw"
						+ "\n3.Balance\n4.Exit");
				switch(Integer.parseInt(sc.nextLine()))
				{
				case 1:
					while(true)
					{
					System.out.println("Enter AMount: ");
					if(!new Deposit().process(Integer.parseInt(sc.nextLine())))
						break;					
					}
					break;
				case 2:
					while(true)
					{
					System.out.println("Enter AMount: ");
					if(!new Withdraw().process(Integer.parseInt(sc.nextLine())))
						break;					
					}
					break;
				case 3:
					Transaction.b.getBal();
					break;
				case 4:
					System.out.println("Thanks for using Serives");
					sc.close();
					System.exit(0);
				default:
					System.out.println("Invalid Selection");	
				}
			}
		}
		else
		{
			System.out.println("Reach the nearest Branch to change"
					+ " Pin");
			sc.close();
			System.exit(0);
		}
		
		
		
	}
}
