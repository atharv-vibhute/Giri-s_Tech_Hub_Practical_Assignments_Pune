/*
Q50. Write a java program to print this pattern.

				1
			2	2
		3	3	3
	4	4	4	4
                3	3	3	
                        2	2
                                1
*/

public class Q50_Pattern_50
{
	public static void main(String X[])
	{
		int i, j;
		int k = 1;

		for(i = 1; i <= 7; i++)
		{
			for(j = 1; j <= 4; j++)
			{
				if(i <= 4 && i + j >= 5)
				{
					System.out.print(k + "     ");
				}
				else if(i > 4 && i - j <= 3)
				{
					System.out.print(k + "     ");
				}
				else
				{
					System.out.print("      ");
				} 
			}
			
			System.out.println();
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
