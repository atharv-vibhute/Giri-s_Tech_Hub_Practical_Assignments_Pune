/*
Q50. Task: Identify the first digit in a number that does not repeat anywhere else, using only loops.
Example: n = 1213451 → first non-repeating digit = 2.
*/

// fails at 0

import java.util.Scanner;

public class Q50_Non_Repeating_Number_Dnyashnashwar_Sir
{
	public static void main(String X[])
	{
		int n, temp, r, d, cnt;
		int rev = 0;
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		n = sc.nextInt();
		sc.close();

		temp = n;

		// Reverse the number;
		do
		{
			r = temp % 10;
			temp = temp / 10;
			rev = rev * 10 + r;
		} while(temp != 0);

		do
		{
			d = rev % 10;
			rev = rev / 10;
			cnt = 0;
			temp = n;

			do 
			{
				r = temp % 10;
				temp = temp / 10;
				
				if(r == d)
				{
					cnt++;
				}
	
			} while(temp != 0);

			if(cnt == 1)
			{
				break;
			}

		} while(rev != 0);

		System.out.println((cnt == 1)? d : "No non-repeting number");
	}
}


































