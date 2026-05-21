// Q38. Write a java program to find all prime factors of a number.

public class Q38_Prime_Factors
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		int j = 2;
		int i, c;

		while(j <= n)
		{
			i = 1;
			c = 0;
			while(i <= j)
			{
				if(j % i == 0)
				{
					c++;
				}
				i++;
			}

			if(c == 2)
			{
				if(n % j == 0)
				{
					System.out.println(j);
				}
			}
			j++;
		}
	}
}