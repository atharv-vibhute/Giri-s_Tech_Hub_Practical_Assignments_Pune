/*
Q82. Write a java program to print this pattern.


                1    
    	    A	    B   
	2		3  
    B			    C	 	
4	5	6	7	8
*/

public class Q82_Pattern_82
{
	public static void main(String X[])
	{
		int i, j, A;
		int k = 1;

		for(i = 1; i <= 5; i++)
		{
			System.out.println();
			A = 64 + i / 2;

			for(j = 1; j <= 9; j++)
			{
				if((i + j) % 2 == 0)
				{
					if((6 - i == j || 4 + i == j) && i % 2 == 0)
					{
						System.out.print((char)A + "   ");
						A++;
					}
					else if((6 - i == j || 4 + i == j || i == 5) && i % 2 != 0)
					{
						System.out.print(k + "   ");	
						k++;
					}
					else
					{
						System.out.print("    ");
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

