/*
Q49. Task: For a number n, calculate:
Sum of digits at even places (from right)
Sum of digits at odd places (from right)
Finally print the difference of these sums.
Example: n = 572631 → even places sum = 7+6+1 = 14, odd places sum = 5+2+3 = 10 → difference = 4.
Hint: Use a loop with position tracking.
*/

public class Q49_Sum_Even_Odd_Digits
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		int m = n / 10;
		int e = 0;
		int o = 0;
		int r = 0;

		for(; n != 0;)
 		{
			r = n % 10;
			e = e + r;
			n = n / 100;
		}

		for(; m != 0;)
		{
			r = m % 10;
			o = o + r;
			m = m / 100;
		}

		r = (e > o)? (e - o):(o - e);
		System.out.println(r);
	}
}
