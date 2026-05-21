/*
Q4. Write a java program to print this pattern.

*
**
***
****
*****
*/

public class Q4_Pattern_4
{
	public static void main(String X[])
	{
		int i, j;

		for(i = 1; i <= 5; i++)
		{
			System.out.println();

			for(j = 1; j <= 5; j++)
			{
				if(j <= i)
				{
					System.out.print("*");
				}
			}
		}
	}
}