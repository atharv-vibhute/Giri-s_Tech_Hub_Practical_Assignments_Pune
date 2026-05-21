/*
Q42. Write a java program to print this pattern.

	1	2	3	4	5
	6	7	8	1	2
	3	4	5	6	7
	8	1	2	3	4	
	5	6	7	8	1
*/

public class Q42_Pattern_42
{
	public static void main(String X[])
	{
		int i, j;
		int k = 1;
		
		for(i = 1; i <= 5; i++)
		{
			System.out.println();

			for(j = 1; j <= 5; j++)
			{
				System.out.print(k + "   ");
				k++;
				if(k > 8)
				{
					k = k - 8;
				}
			}
		}
	}
}