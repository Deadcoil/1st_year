package test;
import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int a=s.nextInt();
		
		System.out.print("Enter second number: ");
		int b=s.nextInt();
		
		System.out.print("Enter third number: ");
		int c=s.nextInt();
		
		if(c>b && b>a && c>a)
		{
			System.out.println("Increasing in Order!!");
		}
		else if(a>b && b>c && a>c)
		{
			System.out.println("Decreasing in order!!");
		}
		else
			System.out.println("Neither Increasing nor decreasing!!");
	}

}
