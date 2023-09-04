package method;
import java.util.Scanner;

public class Counting_vowel {

	public static int Vowels(String str)
	{
		String s=str.toUpperCase();
		int c=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
			{
				c++;
			}
		}
		return c;
	}
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the word: ");
		String str=s.next();
		
		System.out.println("Number of Vowels are: "+Vowels(str));
	}
	

}
