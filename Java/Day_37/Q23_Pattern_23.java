/*
Q23. Write a java program to print this pattern.

	#
	#	*
	#	*	#
	#	*	#	*
	#	*	#	*	#
	#	*	#	*
	#	*	#	
	#	*
	#	
*/

public class Q23_Pattern_23
{
	public static void main(String X[])
	{
		int i, j;

		for(i = 1; i <= 9; i++)
		{
			System.out.println();

			for(j = 1; j <= 5; j++)
			{
				if(i <= 5 && j <= i)
				{
					if(j % 2 == 0)
					{
						System.out.print("  *  ");
					}
					else
					{
						System.out.print("  #  ");
					}
				}	
				else if(i >= 5 && j <= 10 - i)
				{
					if(j % 2 == 0)
					{
						System.out.print("  *  ");
					}
					else
					{
						System.out.print("  #  ");
					}
				}
			}
		}
	}
}