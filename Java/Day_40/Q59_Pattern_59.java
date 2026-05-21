/*
Q59. Write a java program to print this pattern.

1        								1
1	2							2	1
1	2	3					3	2	1
1	2	3	4			4	3	2	1
1	2	3	4	5	5	4	3	2	1
*/

public class Q59_Pattern_59
{
	public static void main(String X[])
	{
		int i, j, k;
		
		for(i = 1; i <= 5; i++)
		{
			System.out.println();
			k = 1;

			for(j = 1; j <= 10; j++)
			{
				if(j <= 5 && i >= j)
				{
					System.out.print(k + "   ");
					k++;
				}
				else if(j > 5 && i + j >= 11)
				{
					k--;
					System.out.print(k + "   ");
				}
				else
				{
					System.out.print("    ");
				}
			}
		}
	}
}
