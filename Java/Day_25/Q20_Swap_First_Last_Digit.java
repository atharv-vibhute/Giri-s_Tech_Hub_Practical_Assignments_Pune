// Q20. Write a java program to swap first and last digits of a number.

import java.lang.Math;

public class Q20_Swap_First_Last_Digit
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		int l = n % 10;
		int i = -1;
		double m = n;
		int f = 0;
		while(n != 0)
		{
			if(n < 10)
			{
				f = n;
			}
			n = n / 10;
			i++;
		}
		m = m - Math.pow(10, i) * f - l;
		m = m + Math.pow(10, i) * l + f;
		System.out.println((int)m);
	}
}