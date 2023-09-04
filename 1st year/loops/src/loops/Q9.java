package loops;
import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
		int number = scanner.nextInt();
	    scanner.close();

		        int result = removeZeros(number);
		        System.out.println("Number after removing zeros: " + result);
		    }

		    public static int removeZeros(int n) {
		        int result = 0;
		        int multiplier = 1;

		        while (n > 0) {
		            int digit = n % 10;
		            if (digit != 0) {
		                result += digit * multiplier;
		                multiplier *= 10;
		            }
		            n /= 10;
		        }

		        return result;
		    }
		}



