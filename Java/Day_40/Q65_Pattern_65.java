/*
Q65. Write a java program to print this pattern.

						A
					B	A
				C	B	A
			D	C	B	A
		E	D	C	B	A
*/

public class Q65_Pattern_65
{
	public static void main(String X[])
	{
		int i, j, A;
		for(i = 1; i <= 5; i++)
		{
			System.out.println();
			
			for(j = 1; j <= 5; j++)
			{
				A = 70 - j;
			        System.out.print((i + j >= 6)? (char)A + "     " : "      ");
			}
		}
	}
}