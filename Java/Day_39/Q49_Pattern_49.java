/*
Q49. Write a java program to print this pattern.

	1	1	1	1	1	1	1
		2	2	2	2	2	
			3	3	3	
				4
			5	5	5
		6	6	6	6	6
	7	7	7	7	7	7	7
*/

public class Q49_Pattern_49
{
	public static void main(String X[])
	{
		int i, j;

		for(i = 1; i <= 7; i++)
		{
			System.out.println();

			for(j = 1; j <= 7; j++)
			{
				if(i <= 4 && i <= j && i + j <= 8)
				{
					System.out.print(i + " ");
				}
				else if(i > 4 && i >= j && i + j >= 8)
				{
					System.out.print(i + " ");
				}
				else
				{
					System.out.print("  ");
				}
			}
		}
	}
}
