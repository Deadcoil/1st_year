package method;
import java.util.Scanner;

public class Prac {
	
	public static void sayHi()
	{
		System.out.println("Hello");
	}
	
	public static void Sum(int a, int b)
	{
		int result=a+b;
		System.out.println(result);
	}

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		
		Sum(50, 50);
		sayHi();
	}

}
