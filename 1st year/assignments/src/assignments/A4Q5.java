package assignments;
import java.util.Scanner;

public class A4Q5 {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=s.nextInt();
		
		
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0) {
				sum+=i;
			}
				
		}
		if (sum==n)
		{
			System.out.println("Is a Perfect number!");
		}
			
		
		else {
			System.out.println("Not a perfect number!");
		}
		
	}

}
