package loops;
import java.util.Scanner;

public class Hollow_triangle {

	public static void main(String[] args) {
		        Scanner s=new Scanner(System.in);
		        System.out.println("Enter the rows: ");
		        int rows=s.nextInt();
		        
		        for (int i = 1; i <= rows; i++)
		        {
		            // Print spaces before the first asterisk
		            for (int j = 1; j <= rows - i; j++) 
		                System.out.print(" ");
		            
		            
		            // Print spaces between the two asterisks
		            for (int j = 1; j <= 2 * i - 1; j++) 
		            {
		            
		            
		            // Print the second asterisk (except for the last row)
		            if (i == rows) {
		                System.out.print("*");
		            }
		            else
		            	if(j==1 || j==2*i-1)
		            		System.out.print("*");
		            	else
		            		System.out.print(" ");
		            }
		            
		            // Move to the next line
		            System.out.println();
		        }
		    }
		}


	


