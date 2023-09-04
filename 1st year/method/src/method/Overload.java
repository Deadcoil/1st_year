package method;
import java.util.Scanner;


public class Overload {

	public static int sum(int... x)
	{
		int total=0;
		for(int x1:x)
		{
			total+=x1;
		}
		return total;		
	}
	
	
	public static void main(String[] args) 
	{
		System.out.println(sum());
		System.out.println(sum(2,3));
		System.out.println(sum(2,3,4));
		System.out.println(sum(2,3,4,5));
		System.out.println(sum(2,3,4,5,6));
		System.out.println(sum(2,3,4,5,6,7));
	}

}

