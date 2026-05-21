/*
Q77. Write a java program to print this pattern.

A 	B 	C 	D
A     			D
A			D
A	B	C	D
*/

public class Q77_Pattern_77
{
	public static void main(String X[])
	{
		int i, j, A;
		for(i = 1; i <= 4; i++)
		{
			System.out.println();
			for(j = 1; j <= 4; j++)
			{
				A = 64 + j; 
				System.out.print((i == 1 || i == 4 || j == 1 || j == 4)? (char)A + "     " : "      ");
			}
		}
	}
}