/*
Q5. Write a java program to print this pattern.

*****
****
***
**
*
*/

public class Q5_Pattern_5
{
	public static void main(String X[])
	{
		int i, j;

		for(i = 5; i >= 1; i--)
		{
			System.out.println();

			for(j = 5; j >= 1; j--)
			{
				if(j <= i)
				{
					System.out.print("*");
				}
			}
		}
	}
}