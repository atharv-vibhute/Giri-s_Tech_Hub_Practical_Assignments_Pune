/*
Q36. Write a java program to print this pattern.
			
			1
		    1        2
	 	1	2	3
            1	    2	    3       4
	1	2	3	4	5
*/

public class Q36_Pattern_36
{
	public static void main(String X[])
	{
		int i, j, k;
		for(i = 1; i <= 5; i ++)
		{
			k = 1;
			System.out.println();

			for(j = 1; j <= 9; j++)
			{
				if((i + j) % 2 == 0 && 6 - i <= j && 4 + i >= j)
				{
					System.out.print(k + "  ");
					k++;
				}
				else
				{
					System.out.print("   ");
				}	
			}
		}
	}
}