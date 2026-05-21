/*
Q80. Write a java program to print this pattern.

A      							A
A	B    					B	A
A	B	C  			C	B	A
A	B	C	D	D	C	B	A
A	B	C  			C	B	A
A	B   					B	A
A							A
*/

public class Q80_Pattern_80
{
	public static void main(String X[])
	{
		int i, j, A;

		for(i = 1; i <= 7; i++)
		{
			System.out.println();
			A = 65;

			for(j = 1; j <= 8; j++)
			{
				if(i >= j && j < 5 && i + j <= 8)
				{
					System.out.print((char)A + "     ");
					A++;
				}
				else if(i + j > 8 && j >= 5 && i < j)
				{
					A--;
					System.out.print((char)A + "     ");
				}
				else 
				{
					System.out.print("      ");
				}
			}
		}
	}
}