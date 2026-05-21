/*
Q2. Write a java program to print this pattern.

	*	*	*	*	*
	*				*
	*				*
	*				*
	*	*	*	*	*
*/

public class Q2_Pattern_2
{
	public static void main(String X[])
	{
		int i, j;

		for(i = 1; i <= 5; i++)
		{
			System.out.println();

			for(j = 1; j <= 5; j++)
			{
				if(i == 1 || i == 5 || j == 1 || j == 5)
				{
					System.out.print(" * ");
				}
				else
				{
					System.out.print("   ");
				}
			}
		}
	}
}