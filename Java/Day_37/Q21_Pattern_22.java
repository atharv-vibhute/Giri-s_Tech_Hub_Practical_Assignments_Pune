/*
Q21. Write a java program to print this pattern.

	*	*	*	*	*
	    *	     		    *
		*               *
		    *       *
			*  
*/

public class Q21_Pattern_22
{
	public static void main(String X[])
	{
		int i, j;

		for(i = 1; i <= 5; i++)
		{
			System.out.println();

			for(j = 1; j <= 9; j++)
			{
				if((i + j) % 2 == 0)
				{
					if(j == i || j == 10 - i || i == 1)
					{
						System.out.print(" * ");
					}
					else
					{
						System.out.print("   ");
					}
				}
				else
				{
					System.out.print("   ");
				}
			}
		}
	}
}