/*
Q22. Write a java program to Check Number Is Perfect Number or Not.
Example : perfect number, a positive integer that is equal to the sum of its proper divisors. The smallest perfect number is 6,which is the sum of 1, 2, and 3. Other perfect numbers are 28, 496, and 8,128.
*/

public class Q22_Perfect_Number
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		int i = 1;
		int s = 0;

		while(i <= (n/2))
		{
			if(n % i == 0)
			{
				s = s + i;
			}
			i++;
		}

		if(s == n)
		{
			System.out.println("Perfect Number");
		}
		else
		{
			System.out.println("Not Perfect Number");
		}
	}
}