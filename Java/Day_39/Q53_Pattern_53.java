/*
Q53.  Write a java program to print this pattern.

	1	2	3	4	5
	6			7
	8		9
	10	11
	12
*/

public class Q53_Pattern_53
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
				if(i == 1 || j == 1 || i + j == 6)
				{
					System.out.print(k + "   ");
					k++;
				}
				else
				{
					System.out.print("    ");
				}
			}
		}
	}
}
