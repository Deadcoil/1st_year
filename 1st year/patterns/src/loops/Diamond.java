package loops;
import java.util.Scanner;

public class Diamond {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your rows: ");
		int n=s.nextInt();
		int space=n-1;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			space--;//3
			
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		space=1;
		
		for(int i=1;i<=n-1;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" 	");
			}
			space++;
			
			for(int j=1;j<=2*(n-i)-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
