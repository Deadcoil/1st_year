package test;
import java.util.Scanner;
import java.util.Random;

public class Q4 {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter user number: ");
		int a=s.nextInt();
		
		Random r=new Random();
		int x=r.nextInt(9);
		System.out.println("computer gusses: "+x);
		
		if(a==x)
		{
			System.out.println("You got it right!!");
		}
		else if(x==(a-1) || x==(a+1))
		{
			System.out.println("Almost got it!!");
		}
		else
			System.out.println("You got it wrong!!");
	}

}
