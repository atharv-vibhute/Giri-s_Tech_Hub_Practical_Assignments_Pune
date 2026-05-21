/*
Q10. Write a java program to print this pattern.
		
		*  *  *  *  *  *  *  *  *
		   *  *  *  *  *  *  *
		      *   *  *  *  *
			*  *  *
			    *
*/

public class Q10_Pattern_10
{
	public static void main(String X[])
	{
		int i, j;

		for(i = 5; i >= 1; i--)
		{
			System.out.println();

			for(j = 9; j >= 1; j--)
			{
				if((j > 5 - i) && (j < 5 + i))
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