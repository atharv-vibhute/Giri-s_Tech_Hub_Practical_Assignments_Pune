/*
Q24. Write a java program to print this pattern.

				*
			*	*	*
		*		*		*
	*			*			*
*	*	*	*	*	*	*	*	*
	*			*			*
		*		*		*
			*	*	*
				*
*/

public class Q24_Pattern_24
{
	public static void main()
	{
		int i, j;

		for(i = 1; i <= 9; i++)
		{
			System.out.println();

			for(j = 1; j <= 9; j++)
			{
				if((i < 5) && (j == 4 + i || i + j == 6))
				{
					System.out.print("  *  ");
				}
				else if(i == 5 || j == 5)
				{
					System.out.print("  *  ");
				}
				else if((i > 5) && (j == i - 4) || (i + j == 14))
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