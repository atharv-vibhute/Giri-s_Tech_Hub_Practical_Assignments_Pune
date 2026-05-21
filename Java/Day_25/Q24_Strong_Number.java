/*
Q24. Write a java program to Check Number Is Strong Number or Not.
Example : A strong number is one in which the factorial of the digits equals the number itself. 1, 2, 145,
*/

public class Q24_Strong_Number
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		int r = 0;
		int s = 0;
		int k = n;
		int i, m;

		while(n != 0)
		{
			r = n % 10;
			i = 1;
			m = 1;

			while(i <= r)
			{
				m = m * i;
				i++;
			}

			s = s + m;
			n = n / 10;
		}

		if(k == s)
		{
			System.out.println("Strong Number");
		}
		else
		{
			System.out.println("Not Strong Number");
		}
	}
}