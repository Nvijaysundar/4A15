package p1;
import java.util.*;
public class Events {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean depart =true,subdep=true,eve=true;
		
		while(true) {
			System.out.println("Welcome to XYZ EVTS");
			System.out.println("1.PIET\n2.PIT\n3.exit\nEnter you College");
			switch(sc.nextInt())
			{
			case 1:
				break;
			case 2:
				while(depart) {
					System.out.println("1.CSE\n2.EEE\n3.ECE\n4.Back\n5.exit\nSelect Department:");
					switch(sc.nextInt())
					{
					case 1:
						while(subdep)
						{
							System.out.println("1.AI\n2.BC\n3.CC\n4.BDA\n5.Back\n6.Exit\nSelect SUbDep:");
							switch(sc.nextInt())
							{
							case 1:
								while(eve)
								{
									System.out.println("Welcome to AI");
									System.out.println("Events:1.ML BootCamp\n2.PowerBI\nSelect Your Choice");
									switch(sc.nextInt())
									{
									case 1:
										System.out.println("Event : Ml BootCamp");
										System.out.println("Description: ");
										System.out.println("College : PIT\nBlock:A\nVenue: 362");
										break;
									case 2:
										System.out.println("Event : PowerBI");
										System.out.println("DEscription: ");
										System.out.println("College: PIT\nBlock: A\n Venue: Lab -N");
								
										break;
									case 3:
										eve =false;
										break;
									case 4:
										System.out.println("ThankYou");
										System.exit(0);
									}
								}
								eve = true;
								break;
							case 2:
								break;
							case 3:
								break;
							case 4:
								break;
							case 5:
								subdep=false;
								break;
							case 6:
								System.out.println("Thankyoi");
								sc.close();
								System.exit(0);
							}
		
						}
						subdep=true;
						break;
					case 2:
						break;
					case 3:
						break;
					case 4:
						depart =false;
						break;
					case 5:
						System.out.println("Thankyou");
						sc.close();
						System.exit(0);
					}
				}
				depart =true;
				break;
			case 3:
				System.out.println("ThankYou!!!");
				sc.close();
				System.exit(0);
			default:
				System.out.println("Invalid Selection");
			}
		}
	}

}
