/*
Q37. Write a java program to print this pattern.

	1	2	3	4	5	6	7	8	9
		1	2	3	4	5	6	7
			1	2	3	4	5	
				1	2	3
					1
*/

public class Q37_Pattern_37
{
	public static void main(String X[])
	{
		int i, j, k;

		for(i = 1; i <= 5; i++)
		{
			System.out.println();
			k = 1;

			for(j = 1; j <= 9; j++)
			{
				if(i <= j && 10 - i >= j)
				{
					System.out.print(k + "    ");
					k++;
				}
				else
				{
					System.out.print("     ");
				}
			}
		}
	}
}