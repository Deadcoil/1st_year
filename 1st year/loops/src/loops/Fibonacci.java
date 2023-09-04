package loops;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the digit place: ");
		int n=s.nextInt();
		
		int v1=1,v2=1;
		int result=0;
		
		if(n>2)
		{
			for(int i=1; i<=n-2; i++)
			{
				result=v1+v2;
				v1=v2;
				v2=result;
			}
			System.out.println("Result is: "+result);
		}
		else
		{
			System.out.println("Result is: "+ ((n==1 || n==2) ? v1:v2));
		}
		
	}

}
