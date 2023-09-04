package loops;
import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) 
	{
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter a number N: ");
		        int N = scanner.nextInt();
		        scanner.close();

		        int largestPowerOfThree = findLargestPowerOfThree(N);
		        System.out.println("Largest power of three less than or equal to N: " + largestPowerOfThree);
		    }

		    public static int findLargestPowerOfThree(int N) {
		        int power = 0;
		        int result = 1;

		        while (result * 3 <= N) {
		            result *= 3;
		            power++;
		        }

		        return result;
		    }
		}


