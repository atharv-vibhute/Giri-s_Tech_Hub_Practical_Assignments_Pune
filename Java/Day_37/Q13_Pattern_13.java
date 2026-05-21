/*
Q13. Write a java program to print this pattern.

*	*	*	*	*
*	*	*	*	#
*	*	*	#	#
*	*	#	#	#
*	#	#	#	#
*/

public class Q13_Pattern_13
{
	public static void main(String X[])
	{
		int i, j;

		for(i = 1; i <= 5; i++)
		{
			System.out.println();

			for(j = 1; j <= 5; j++)
			{
				if(i + j > 6)
				{
					System.out.print(" # ");
				}
				else
				{
					System.out.print(" * ");
				}
			}
		}
	}
}