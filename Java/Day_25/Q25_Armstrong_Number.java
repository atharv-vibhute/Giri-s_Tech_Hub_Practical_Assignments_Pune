/*
Q25. Write a java program to Check Number Is Armstrong Number or Not.
Example : A number is thought of as an Armstrong number if the sum of its own digits raised to the power number of digits gives the number itself.
      For example, 0, 1, 153, 370, 371, 407 are three-digit Armstrong numbers and, 1634, 8208, 9474 are four-digit Armstrong numbers and there are many more.
*/

import java.lang.Math;

public class Q25_Armstrong_Number
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		int m = n;
		int i = 0;
		double s = 0;
		int r = 0;

		while(n != 0)
		{
			n = n / 10;
			i++;
		}
		n = m;
		while(n != 0)
		{
			r = n % 10;
			s = s + Math.pow(r, i);
			n = n / 10;
		}	

		if(m == s)
		{
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println("Not Armstrong Number");
		}
	}
}