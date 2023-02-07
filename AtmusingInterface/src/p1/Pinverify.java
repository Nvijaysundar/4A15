package p1;

import java.util.Scanner;

public class Pinverify {

	 boolean pincheck(Scanner sc) {
		 int pinchances=3;
		 while(true)
		 {
			 System.out.println("Enter Pin Value");
			 switch(Integer.parseInt(sc.nextLine()))
			 {
			 case 1111,2222,3333:
				 return true;
			 default:
				 System.out.println("Invalid Pin");
				 System.out.println("Leftover Chances: "+ --pinchances);
			 }
			 if(pinchances ==0)
				 return false;
		 }
	}

}
