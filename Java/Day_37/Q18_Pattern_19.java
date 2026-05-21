/*
Q18. Write a java program to print this pattern.

*	*	*	*	*	*	
    *       *	    *       *       *        
        *	*	*	*
	    *       *       *
	        *       *
	            *
*/

public class Q18_Pattern_19
{
	public static void main(String X[])
	{
		int i, j;
		for(i = 1; i <= 6; i++)
		{
			System.out.println();
			for(j = 1; j <= 11; j++)
			{
				if((i+j) % 2 == 0)
				{
					if(j >= i && j <= 12 - i)
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