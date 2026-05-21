// Q30.  Write a java program to display 1 to nth Perfect Number.

public class Q30_Nth_Perfect_Number
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		int j = 1;
		int i, s;
		int c = 0;

		while(c < n)
		{
			i = 1;
			s = 0;

			while(i <= (j/2))
			{
				if(j % i == 0)
				{
					s = s + i;
				}
				i++;
			}
		
			if(j == s)
			{
				System.out.println(j);
				c++;
			}

			j++;
		}
	}
}