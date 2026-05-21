/*
Q11. Write a java program to print this pattern.

*
*	*
* 		*
*  			*
*	*	*	*	*
*/

public class Q11_Pattern_11
{
	public static void main(String X[])
	{
		int i, j;
		
		for(i = 1; i <= 5; i++)
		{
			System.out.println();

			for(j = 1; j <= 5; j++)
			{
				if(j == i || j == 1 || i == 5)
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
