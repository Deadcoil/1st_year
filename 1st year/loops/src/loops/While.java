package loops;
import java.util.Scanner;

public class While 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		int num;
		do
		{
			System.out.print("Enter a number between 1 to 10: ");
			num=s.nextInt();
			
		}while(num<=1 || num>=10);
		
		System.out.println(num+" is between 1 to 10.");

	}

}
