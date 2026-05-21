/*
Q63. Write a java program to print this pattern.

	A
	B	B
	C	C	C	
	D	D	D	D
	E	E	E	E	E
*/

public class Q63_Pattern_63
{
	public static void main(String X[])
	{
		int i, j, A;
		for(i = 1; i <= 5; i++)
		{
			A = 64;
			A = A + i;
			System.out.println();
			for(j = 1; j <= i; System.out.print((char)A + "    "), j++);
		}
	}
}