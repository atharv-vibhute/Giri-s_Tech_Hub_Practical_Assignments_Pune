/*
Q41. Write a java program to print this pattern.

	1
	3	3	3
	5	5	5	5	5	
	3	3	3
	1
*/

public class Q41_Pattern_41
{
	public static void main(String X[])
	{
		int i, j;
		int k = 1;
		for(i = 1; i <= 5; i++)
		{

			for(j = 1; j <= k; System.out.print(k + "   "), j++);

			if(i < 3)
			{
				k = k + 2;
			}
			else
			{
				k = k - 2;
			}

				System.out.println();
		}
	}
}