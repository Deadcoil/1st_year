package loops;
import java.util.Scanner;

public class Number_changing 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of row: ");
		int n=s.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			int c=(i%2==0)?0:1;
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(c+" ");
				c=1-c;
			}
			System.out.println();
		}
		
	}

}
