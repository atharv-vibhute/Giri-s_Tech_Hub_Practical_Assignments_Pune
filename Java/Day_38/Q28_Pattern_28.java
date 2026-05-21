/*
Q28. Write a java program to print this pattern.
					*
				*		*
			*		*		*
		*		*		*		*
	*		*		*		*		*
		*		*		*		*
			*		*		*
				*		*
					*
*/

public class Q28_Pattern_28
{
	public static void main(String X[])
	{
		int i, j;

		for(i = 1; i <= 9; i++)
		{
			System.out.println();

			for(j = 1; j <= 9; j++)
			{
				if((i + j) % 2 == 0)
				{
					if(i <= 5 && 6 - i <= j && 4 + i >= j)
					{
						System.out.print("  *  ");
					}
					else if(i >= 5 && i - j <= 4 && i + j <= 14)
					{
						System.out.print("  *  ");
					}
					else
					{
						System.out.print("     ");
					}
				}
				else
				{
					System.out.print("     ");
				}
			}
		}
	}
}