/*
Q74. Write a java program to print this pattern.

A
A	B	A
A	B	C	B	A
A	B	C	D	C	B	A
A	B	C	D	E	D	C	B	A
*/

public class Q74_Pattern_74
{
	public static void main(String X[])
	{
		int i, j, A; 
		
		for(i = 1; i <= 5; i++)
		{
			System.out.println();
			A = 65;

			for(j = 1; j <= i * 2 - 1; j++)
			{
				if(i > j)
				{
					System.out.print((char)A + "   ");
					A++;
				}
				else 
				{
					System.out.print((char)A + "   ");
					A--;
				}
			}
		}
	}
}

