/*
Q43. Write a java program to print this pattern.

	1	2	3	4	5
	2	2	3	4	5
	3	3	3	4	5
	4	4	4	4	5
	5	5	5	5	5
*/

public class Q43_Pattern_43
{
	public static void main(String X[])
	{
		int i, j;
		int k = 1;

		for(i = 1; i <= 5; i++)
		{
			System.out.println();

			for(j = 1; j <= 5; j++)
			{
				System.out.print((k > j)? k + "   " : j + "   ");
			}
			k++;
		}
	}
}