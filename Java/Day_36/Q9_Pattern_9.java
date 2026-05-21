/*
Q9. Write a java program to print this pattern.
			
  	   *
	*  *  *
      *  *  *  *  *
   *  *  *  *  *  *  *
*  *  *  *  *  *  *  *  *
*/

public class Q9_Pattern_9
{
	public static void main(String X[])
	{
		int i, j;
		
		for(i = 1; i <= 5; i++)
		{
			System.out.println();

			for(j = 1; j <= 9; j++)
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