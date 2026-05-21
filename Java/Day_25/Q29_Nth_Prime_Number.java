// Q29. Write a java program to display 1 to nth Prime Number.

public class Q29_Nth_Prime_Number
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		int i, c;
		int j = 2;
		int t = 0;

		while(t < n)
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
				System.out.println(j);
				t++;
			}
			j++;
		}
	}
}