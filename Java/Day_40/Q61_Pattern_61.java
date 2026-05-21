/*
Q61. Write a java program to print this pattern.

A	B	C	D	E
A	B	C	D	E
A	B	C	D	E	
A	B	C	D	E
A	B	C	D	E
*/

public class Q61_Pattern_61
{
	public static void main(String X[])
	{
		int A, i, j;
		
		for(i = 0; i < 5; i++)
		{
			System.out.println();

			for(j = 0; j < 5; j++)
			{
				A = 65;
				A = A + j;
				System.out.print((char)A + "       ");
			}
		}
	}
}