/*
Q7. Write a java program to print this pattern.

*****
 ****
  ***
   **
    *
*/

public class Q7_Pattern_7
{
	public static void main(String X[])
	{
		int i, j;

		for(i = 5; i >= 1; i--)
		{
			System.out.println();

			for(j = 1; j <= 5; j++)
			{
				if(i + j > 5)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
		}
	}
}