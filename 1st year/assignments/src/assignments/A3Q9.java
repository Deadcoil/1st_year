package assignments;
import java .util.Scanner;

public class A3Q9 {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first number: ");
		int a =s.nextInt();
		
		System.out.println("Enter Second number: ");
		int b =s.nextInt();
		
		System.out.println("Enter third number: ");
		int c =s.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println(a+" is Greatest");
			if(b>c)
			{
				System.out.println(b+" is 2nd largest");
			}
			else
			{
				System.out.println(c+" is 2nd largest");
			}
		}
		
		if(b>a && b>c)
		{
			System.out.println(b+" is Greatest");
			if(a>c)
			{
				System.out.println(a+" is 2nd largest");
			}
			else
			{
				System.out.println(c+" is 2nd largest");
			}
		}
		
		if(c>b && c>a)
		{
			System.out.println(c+" is Greatest");
			if(b>a)
			{
				System.out.println(b+" is 2nd largest");
			}
			else
			{
				System.out.println(a+" is 2nd largest");
			}
		}
	}

}
