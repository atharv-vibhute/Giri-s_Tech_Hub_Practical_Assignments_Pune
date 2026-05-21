/*
Q6. Write a java program to print this pattern.

	 *
       * *
     * * *
   * * * *
*/

public class Q6_Pattern_6
{
	public static void main(String X[])
	{
		int i, j;

		for(i = 1; i <= 4; i++)
		{
			System.out.println();

			for(j = 1; j <= 4; j++)
			{
				if(i + j > 4)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
		}
	}
}
