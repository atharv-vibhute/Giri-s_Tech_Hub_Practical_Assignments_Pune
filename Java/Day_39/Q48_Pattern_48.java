/*
Q48. Write a java program to print this pattern.

	1
	2	*	2
	3	*	3	*	3
	4	*	4	*	4	*	4
	3	*	3	*	3
	2	*	2
	1
*/

public class Q48_Pattern_48
{
	public static void main(String X[])
	{
		int i, j;
		int k = 1;
		
		for(i = 1; i <= 7; i++)
		{
			System.out.println();

			for(j = 1; j <= (2 * k - 1); j++)
			{
				if(j % 2 == 0)
				{
					System.out.print("  *  ");
				}
				else
				{
					System.out.print("  " + k + "  ");
				}
			} 

			if(i < 4)
			{
				k++;
			}
			else
			{
				k--;
			}
		}
	}
}
