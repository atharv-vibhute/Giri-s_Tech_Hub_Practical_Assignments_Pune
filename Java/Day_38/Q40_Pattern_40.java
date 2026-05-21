/*
Q40. Write a java program to print this pattern.

					1	
				2	3	2
			3	4	5	4	3
                4	5	6	7	6	5	4
	5	6	7	8	9	8	7	6	5
*/

public class Q40_Pattern_40
{
	public static void main(String X[])
	{
		int i, j, k;

		for(i = 1; i <= 5; i++)
		{
			System.out.println();
			k = i;

			for(j = 1; j <= 9; j++)
			{
				if(j <= 4 + i &&  j >= 6 - i && j <= 5)
				{
					System.out.print("  " + k + "  ");
					k++;
				}
				else if(j <= 4 + i && j >= 6 - i && j > 5)
				{
					System.out.print("  " + k + "  ");
					k--;
				}
				else
				{
					System.out.print("     ");
				}
			}
		}
	}
}