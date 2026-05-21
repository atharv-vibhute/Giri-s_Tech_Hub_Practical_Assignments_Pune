// Q17. Write a java program to find all factors of a number.

public class Q17_Factors
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		int i = 1;
		while(i <= n)
		{
			if(n % i == 0)
			{
				System.out.println(i);
			}
			i++;
		}
	}
}