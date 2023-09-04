package method;
import java.util.Scanner;

public class Consecutive_num {

	public static void consecutive(int a, int b, int c)
	{
		if(b==(a+1) && c==(b+1))
		{
			System.out.println("Is a Consecutive number!");
		}
		else
		{
			System.out.println("Not a Consecutive number!");
		}
	}
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first number: ");
		int a=s.nextInt();
		System.out.println("Enter second number: ");
		int b=s.nextInt();
		System.out.println("Enter third number: ");
		int c=s.nextInt();
		
		consecutive(a,b,c);
	}

}
