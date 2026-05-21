/*
Q41. Write a Java program to find the largest and smallest digit of a given number.
 Explanation:
 Use a while loop to extract digits, compare each digit to track max and min.
*/

public class Q41_Largest_Smallest_Digit_Number
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		int mi = n % 10; 
		int ma = n % 10;
		int r;
		
		while(n != 0)
		{
			r = n % 10;
			n = n / 10;

			if(r < mi)
			{
				mi = r;
			}

			if(r > ma)
			{
				ma = r;
			}			
		}

		System.out.println(mi);
		System.out.println(ma);
	}
}