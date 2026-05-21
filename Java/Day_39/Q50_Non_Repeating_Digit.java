
import java.util.Scanner;

public class Q50_Non_Repeating_Digit
{
	public static void main(String X[])
	{
		int n, d, r, temp;
		int rev = 0;
		Boolean flag;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		n = sc.nextInt();
		sc.close();

		// Reverse the number
		do
		{
			r = n % 10;
			n = n / 10;
			rev = rev * 10 + r;
		} while(n != 0);

		// Remove digit separately & Check the digit of the number one by one
		do
		{
			flag = true; // non-repeating number

			// Separate the digit
			d = rev % 10;
			rev = rev / 10;
			temp = rev;
			
			do
			{
				r = temp % 10;
				temp = temp / 10;
				
				if(r == d)
				{
					flag = false; // repeting number;
					break;
				}
			} while(temp != 0);

			if(flag == true)
			{
				break;
			}
		} while(rev != 0);

		System.out.println((flag == true)? d : "Non-repeting Number");
	}
}




































