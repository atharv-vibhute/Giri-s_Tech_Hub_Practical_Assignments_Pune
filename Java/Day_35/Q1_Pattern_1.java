/*
Q1. Write a java program to print this pattern.
	
	*	*	*	*	*
	*	*	*	*	*
	*	*	*	*	*
	*	*	*	*	*
	*	*	*	*	*
*/

public class Q1_Pattern_1
{
	public static void main(String X[])
	{
		int i, j;
		for(i = 0; i <= 5; i++)
		{
			System.out.println();

			for(j = 0; j <= 5; j++)
			{
				System.out.print(" * ");
			}
		}
	}
}