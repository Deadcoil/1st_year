package method;

import java.awt.Point;

public class Reference {
  
	public static void change(Point p)//p=p1--> (1,2)
	{
		p.x=2;
		p.y=1;//p --> (2,1)
	}
	public static void main(String[] args)
	{
		Point p1=new Point();
		p1.x=1;
		p1.y=2;//p1 --> (1,2)
		System.out.println(p1.x+" "+p1.y);//1 2
		
		change(p1);
		
		System.out.println(p1.x+" "+p1.y);//2 1
	}

}
