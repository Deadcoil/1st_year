package test;
import java.util.Scanner;

public class First
{

	public static void main(String[] args)
	{
		First sc=new First();
		sc.Name();
		sc.Age();
		sc.Address();
	}
	
	public void Name()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name=s.next();
		
		System.out.println("User name is: "+name);
	}
	
	public void Age()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age =s.nextInt();
		
		System.out.println("User age is: "+age);
	}
	
	public void Address()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your address: ");
		String add=s.next();
		
		System.out.println("User address is: "+add);
	}

}
