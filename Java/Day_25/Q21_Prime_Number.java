/*
Q21.  Write a java program to check Number Is Prime Number or Not.
Example : A prime number is a number that can only be divided by itself and 1 without remainders.The prime numbers from 1 to 100 are: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97.
*/

public class Q21_Prime_Number
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		int i = 1;
		int f = 0;

		while(i <= n)
		{
			if(n % i == 0)
			{
				f++;
			}
			i++;
		}

		if(f == 2)
		{
			System.out.println("Prime Number");
		}
		else
		{
			System.out.println("Not Prime Number");
		}
	}
}