package test;

public class F {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum();
		Sum(10,20);
		Sum(10,20,30);
		Sum(10,20,30,40);
	}
	public static void Sum(int... x)
	{
		int total=0;
		
		for(int x1:x)
		{
			total+=x1;
		}
		System.out.println("Sum is: "+total);
	}

}
