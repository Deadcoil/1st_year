package loops;
import java.util.Scanner;

public class Random_Avg {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=s.nextInt();
		
		int sum=0;
		int avg=0;
		int count=0;
		
		System.out.print("Random number is: ");
		do
		{
			int r=(int)((Math.random()*n)+1);
			System.out.print(" "+r);
			sum+=r;//sum=sum+r;
			count++;
		}while(count<n);
		System.out.println();
		
		avg=(sum/n);
		System.out.println("Average is: "+avg);
	}

}
