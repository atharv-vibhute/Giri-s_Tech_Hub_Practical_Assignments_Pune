/*
Q52. Write a java program to print this pattern.

	1	0	0	0	1
	0	1	0	1	0
	0	0	1	0	0
	0	1	0	1	0
	1	0	0	0	1
*/

public class Q52_Pattern_52
{
	public static void main(String X[])
	{
		int i, j;
		for(i = 1; i <= 5; i++)
		{
			System.out.println();
			for(j = 1; j <= 5; System.out.print((i == j || i + j == 6)? "   1   " : "   0   "), j++);
		}
	}
}