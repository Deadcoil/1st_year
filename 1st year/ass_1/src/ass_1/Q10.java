package ass_1;

public class Q10 {

	public static void main(String[] args) 
	{
		//String ruler1="1";
		//System.out.println(ruler1);
		//ruler1=ruler1 +2+ ruler1;
		//System.out.println(ruler1);
		//ruler1=ruler1+3+ruler1;
		//System.out.println(ruler1);
		//ruler1=ruler1+4+ruler1;
		//System.out.println(ruler1);
		
		boolean b=true&&false;
		System.out.println(b);
		
		boolean c=b&&true&&true;
		System.out.println(c);
		
		boolean d=b||false;
		System.out.println(d);
		
		boolean f=!b;
		System.out.println(f);
		
		boolean g=!(b&&c || d&&f);
		System.out.println(g);
	}

}
