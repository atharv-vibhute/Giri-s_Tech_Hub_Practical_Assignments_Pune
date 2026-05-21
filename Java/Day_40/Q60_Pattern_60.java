/*
Q60. Write a java program to print this pattern.

	A	A	A	A	A
	B	B	B	B	B
	C	C	C	C	C
	D	D	D	D	D
	E	E	E	E	E
*/

public class Q60_Pattern_60
{
	public static void main(String X[])
	{
		int A = 65, i, j;

		for(i = 0; i < 5; i++)
		{
			A = 65;
			A = A + i;
			System.out.println();

			for(j = 0; j < 5; System.out.print((char)A + "      "), j++);
		}
	}
}

