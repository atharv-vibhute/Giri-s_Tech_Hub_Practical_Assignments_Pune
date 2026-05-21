/*
Q45. Write a java program to print this pattern.

	1
	2	3
	4		5
	6			7
	8	9	10	11	12
*/

public class Q45_Pattern_45
{
	public static void main(String X[])
	{
		int i, j;
		int k = 1;
		
		for(i = 1; i <= 5; i++)
		{
			System.out.println();
			
			for(j = 1; j <= i; j++)
			{
				if(i == 5 || j == 1 || i == j)
				{
					System.out.print(k + "      ");
					k++;
				}
				else
				{
					System.out.print("       ");
				}
			}
		}
	}
}