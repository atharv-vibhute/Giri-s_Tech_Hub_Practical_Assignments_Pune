/*
Q47. Write a java program to print this pattern.

					1
				1		2
			1		2		3
		1		2		3		4
	1		2		3		4		5
		1		2		3		4
			1		2		3
				1		2
					1
*/

public class Q47_Pattern_47
{
	public static void main(String X[])
	{
		int i, j, k;

		for(i = 1; i <= 9; i++)
		{
			k = 1;
			System.out.println();

			for(j = 1; j <= 9; j++)
			{
				if(i <= 5 && (i + j) % 2 == 0 && 6 - i <= j && 4 + i >= j)
				{
					System.out.print(k + "   ");
					k++;
				}
				else if(i > 5 && (i + j) % 2 == 0 && i - j <= 5 && i + j <= 14)
				{
					System.out.print(k + "   ");
					k++;
				}
				else
				{
					System.out.print("    ");
				}
			}
		}
	}
}