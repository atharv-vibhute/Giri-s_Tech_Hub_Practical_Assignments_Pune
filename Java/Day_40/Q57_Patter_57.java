/*
Q57. Write a java program to print this pattern.

	    		1
   		    1       1
    		1   		1
 	    1     		    1
        1	2	3	4	1
*/

public class Q57_Patter_57
{
	public static void main(String X[])
	{
		int i, j;
		int k = 1;

		for(i = 1; i <= 5; i++)
		{
			System.out.println();

			for(j = 1; j <= 9; j++)
			{
				if((6 - i == j || 4 + i == j) && (i + j) % 2 == 0)
				{
					System.out.print("  1  ");	
				}
				else if(i == 5 && (i + j) % 2 == 0)
				{
					k++;
					System.out.print("  " + k + "  ");
				}
				else
				{
					System.out.print("     ");
				}
			}
		}
	}
}