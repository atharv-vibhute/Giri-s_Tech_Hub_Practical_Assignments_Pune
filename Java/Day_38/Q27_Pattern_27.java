/*
Q27. Write a java program to print this pattern.

	*
	*	*
	*	*	*
	*
	*	*
	*	*	*
*/

public class Q27_Pattern_27
{
	public static void main(String X[])
	{
		int i, j, k;

		for(i = 1; i <= 6; i++)
		{	
			k = (i > 3)? (i - 3) : i;
			System.out.println();

			for(j = 1; j <= 3; j++)
			{				
				if(k >= j)
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