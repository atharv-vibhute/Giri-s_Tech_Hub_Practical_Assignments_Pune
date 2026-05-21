/*
Q34. Write a java program to print this pattern.

	1
	2	3
	4	5	6
	7	8	9	10
	11	12	13	14	15
*/

public class Q34_Pattern_34
{
	public static void main(String X[])
	{
		int i, j;
		int k = 0;
		
		for(i = 1; i <= 5; i++)
		{
			System.out.println();

			for(j = 1; j <= i; j++)
			{
				k++;
				System.out.print(k + "   ");
			}
		}
	}
}
