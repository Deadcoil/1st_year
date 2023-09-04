package ass_1;
import java.util.Scanner;

public class Q6 {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter the units: ");
		int unit=s.nextInt();
		double bill=0;
		
		if(unit<=50)
		{
			bill=unit*3;			
			System.out.println("Total bill amount is: "+bill);
		}
		else if(unit>50 && unit<=200)
		{
			bill=(50*3)+((unit-50)*4.80);
			System.out.println("Total bill amount is: "+bill);
		}
		else if(unit>200 && unit<=400)
		{
			bill=(50*3)+(150*4.80)+((unit-200)*5.80);
			System.out.println("Total bill amount is: "+bill);
		}
		else if(unit>400)
		{
			bill=(50*3)+(150*4.80)+(200*5.80)+((unit-400)*6.20);
			System.out.println("Total bill amount is: "+bill);
		}
		
		System.out.print("You want to pay online(y/n): ");
		String o=s.next();
		double d=0;
		double amt=0;
		
		switch(o)
		{
		case "y":
			d=(0.03*bill);
			System.out.println("Discount: "+d);
			amt=bill-d;
			System.out.println("Amount Payable: "+amt);
			break;
			
		case "n":
			System.out.println("Amount Payable: "+bill);
		}
			
	}

}
