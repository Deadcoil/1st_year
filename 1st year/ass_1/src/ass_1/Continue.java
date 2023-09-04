package ass_1;
import java.util.Scanner;

public class Continue {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n;
		
		while(true)
		{
			System.out.println("Enter a number between 0 ans 10: ");
			n=s.nextInt();
			
			if(n<1 || n>10)
				continue;
			
			System.out.println(n+" is between 1 and 10.");
			break;
		}
	}

}
