package question5;
public class Question2 {
	public static void main(String[] args) {
		int sum =0,temp;
		for(int i=1;i<=100;i++)
		{
			temp =i;
			sum=0;
			while(temp>0)
			{
				sum = sum*10 + temp%10;
				temp/=10;
			}
			if(sum ==i)
				System.out.println(i);
		}
	}
}
