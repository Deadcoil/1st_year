package first_program;

public class Incre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		
		int c= (++a + ++b) + (--a + b--) + (a++ + --b) + (a-- + b++);
		System.out.println(c);
	}

}
