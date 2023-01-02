package stringsDemo;
import java.util.*;
public class VCSN {
	public static void main(String[] args) {
	try(Scanner sc = new Scanner(System.in);)
		{
			int vc=0,cc=0,syc=0,dc=0,sum=0;
			String Str = sc.nextLine().toUpperCase();
			for(int i=0;i<Str.length();i++)
			{
				char ch = Str.charAt(i);
				if(ch>=65 && ch<=90)
				{
					switch(ch)
					{
					case 'A':
					case 'E':
					case 'I':
					case 'O':
					case 'U':
						vc++;
					default:
						cc++;
					}
				}
				else if(ch>='0'&& ch<='9')
				{
					dc++;
					sum += Integer.parseInt(String.valueOf(ch));
				}
				else
					syc++;
			}
			System.out.println("Vowels: "+vc);
			System.out.println("Consosnets: "+cc);
			System.out.println("Symbols: "+syc);
			System.out.println("Numbers: "+dc);
			System.out.println("Sum: "+sum);
		}
	}

}
