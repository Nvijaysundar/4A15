package p2;
import Heirarichal.*;
public class Main {
	public static void main(String[] args) {
		Re ob = new Re();
		ob.hp = 350;
		ob.Color = "Black";
		ob.meilage = 20;
		ob.TypeofSilencers = "single";
		ob.Tyres = "Alloy";
		System.out.println(ob.toString());
		
		JavaBike jb = new JavaBike();
		jb.Color = "Red";
		jb.hp = 350;
		jb.meilage = 17;
		jb.Digital_Connectivity = true;
		System.out.println(jb.toString());
	}
}
