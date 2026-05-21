/*
Q48. Task: Take an integer n and an integer k. Rotate the number n by k places to the left without using arrays or strings.
Example: n = 123456, k = 2 → output 345612.
Hint: Use modulus and division to split and rearrange digits.
*/

import java.lang.Math;

public class Q48_Rotate_Number
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		int k = Integer.parseInt(X[1]);
		int t = n;
		int c, m, r;
		double i, j;

		for(c = 0; t != 0; c++)
		{
			t = t / 10;
		}

		m = c - k;
		i = Math.pow(10, m);
		j = Math.pow(10, k);
		
		r = n / (int)i;
		n = n % (int)i;
		n = n * (int)j + r;
		System.out.println(n);
	}
}
