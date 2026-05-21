/*
Q64. Write a java program to print this pattern.

	E	E	E	E	E
	D	D	D	D
	C	C	C
	B	B
	A
*/

public class Q64_Pattern_64
{
	public static void main(String X[])
	{
		int i, j, A;
		for(i = 1; i <= 5; i++)
		{
			System.out.println();
			A = 70;
			A = A - i;

			for(j = 1; j <= 5; j++)
			{
				if(i + j <= 6)
				{
					System.out.print((char)A + "      ");
				}
			}
		}
	}
}