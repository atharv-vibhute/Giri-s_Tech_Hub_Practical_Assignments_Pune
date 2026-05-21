/*
Q25. Write a java program to print this pattern.

	*	*	*	*	*	*	*	*	*
	*	*	*	*		*	*	*	*
	*	*	*				*	*	*
	*	*						*	*
	*								*
	*	*						*	*
	*	*	*				*	*	*
	*	*	*	*		*	*	*	*
	*	*	*	*	*	*	*	*	*
*/

public class Q25_Pattern_25
{
	public static void main(String X[])
	{
		int i, j;

		for(i = 1; i <= 9; i++)
		{
			System.out.println();

			for(j = 1; j <= 9; j++)
			{
				if(i <= 5 && j <= 5 && i + j <= 6)
				{
					System.out.print("  *  ");
				}
				else if(i <= 5 && j >= 5 && j - i >= 4)
				{
					System.out.print("  *  ");
				}
				else if(i >= 5 && j <= 5 && i - j >= 4)
				{
					System.out.print("  *  ");
				}
				else if(i >= 5 && j >= 5 && i + j >= 14)
				{
					System.out.print("  *  ");
				}
				else
				{
					System.out.print("     ");
				}
			}
		}
	}
}