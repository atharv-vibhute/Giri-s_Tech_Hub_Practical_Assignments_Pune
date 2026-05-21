/*
Q62. Write a java program to print this pattern.

	A	B	C	D	E
	B	C	D	E	F
	C	D	E	F	G
	D	E	F	G	H
	E	F	G	H	I
*/

public class Q62_Pattern_62
{
	public static void main(String X[])
	{
		int i, j, A;

		for(i = 0; i < 5; i++)
		{
			System.out.println();

			for(j = 0; j < 5; j++)
			{
				A = 65;
				A = A + i + j;
				System.out.print((char)A + "       ");
			}
		}
	}
}