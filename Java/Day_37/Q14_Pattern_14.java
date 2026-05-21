/*
Q14. Write a java program to print this pattern.

			 *******
			 ******
 			 *****
 			 ****
 			 ***
 			 **
 			 *
 			 **
 			 ***
 			 ****
 			 *****
 			 ******
 			 *******
*/

public class Q14_Pattern_14
{
	public static void main(String X[])
	{
		int i, j;

		for(i = 1; i <= 13; i++)
		{
			System.out.println();
			
			for(j = 1; j <= 7; j++)
			{
				if(((i+j<9) && (i<=7)) || ((i>=7) && (i-j>5)))
				{
					System.out.print("*");
				}
			}
		}

	}
}