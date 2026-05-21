/*
Q55. Write a java program to print this pattern.

					1
                                1	2	1	
                    	1	2	3	2	1
               1	2	3	4	3	2	1
 			1	2	3	2	1	
                                1	2	1	
                                        1
*/

public class Q55_Pattern_55
{
	public static void main(String X[])
	{
		int i, j, k;
		
		for(i = 1; i <= 7; i++)
		{
			System.out.println();
			k = 1;

			for(j = 1; j <= 8; j++)
			{
				if(i <= 4 && 6 - i <= j && 4 + i >= j)
				{
					System.out.print(k + "   ");
					if(j <= 4)
					{
						k++;
					}
					else 
					{
						k--;
					}
				} 
				else if(i > 4 && i - j <= 2 && i + j <= 12)
				{
					System.out.print(k + "   ");
					if(j <= 4)
					{
						k++;
					}	
					else
					{
						k--;
					}
				}
				else
				{
					System.out.print("    ");
				}


			}
		}
	}
}