package loops;
import java.util.Scanner;

public class Q5A3 {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Your First Name: ");
		String Fn=s.next();
		
		System.out.println("Enter Your Last Name: ");
		String Ln=s.next();
		
		System.out.println("Enter Your Age: ");
	    int Age=s.nextInt();
		
		System.out.println("Enter Your Gender(M/F): ");
		String G=s.next();
		
		if(G.equals("F"))
		{
			if(Age>=20)
			{
				System.out.println("Are you married, "+Fn+"(Y/N): ");
				String op=s.next();
				
				if(op.equals("Y"))
				{
					System.out.println("Then I shall call you Mrs. "+Fn+" "+Ln+".");
				}
				else
					System.out.println("Then I shall call you Ms. "+Fn+".");
			}
			else 
				System.out.println("Then I shall call you "+Fn+" "+Ln+".");
		}
		else if(G.equals("M"))	
		{
			if(Age>=20)
			{
				System.out.println("Then I shall call you Mr. "+Fn+".");
			}
			else 
				System.out.println("Then I shall call you "+Fn+" "+Ln+".");
		}
	}

}
