package question5;
public class Question1 {
	//armstrong Number
	//Without using inbuilt method for finding length
	 public static void main(String[] args) {
		for(int i=1;i<=1000;i++)
		{
			if(armstrong(i))
				System.out.println(i);
		}
	 }
	private static boolean armstrong(int i) {
		int cnt = count(i),sum =0,temp =i; 
		while(i>0)
		{
			sum +=  (int)Math.pow(i%10,cnt);
			i/=10;
		}
		if(temp == sum)
			return true;
		else 
			return false;
	}
	private static int count(int i) {

		return String.valueOf(i).length();
	}
}
