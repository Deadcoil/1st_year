package loops;

import java.util.Scanner;

public class HCF_recursive {
	
	static int HCF(int a, int y)
	{
		if(a==0)
			return y;
		
		if(y==0)
			return a;
		
		if(a==y)
			return a;
		
		if(a>y)
			return HCF(a-y, y);
		return HCF(a,y-a);
	}

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int y=s.nextInt();
		
		System.out.println(HCF(a,y));
	}

}
