/*
Q84. Write a java program to print this pattern.


	D
	D	C
	D	C	B
	D	C	B	A
	D	C	B
	D	C
	D
*/

public class Q84_Pattern_84
{
	public static void main(String X[])
	{
		int i, j, A;

		for(i = 1; i <= 7; i++)
		{
			System.out.println();
			A = 68;

			for(j = 1; j <= 4; j++)
			{
				if(i >= j && i + j <= 8)
				{
					System.out.print((char)A + "     ");
					A--;
				}
			}
		}
	}
}