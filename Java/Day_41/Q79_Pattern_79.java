/*
Q79. Write a java program to print this pattern.

A
B	C
C		D
D			E
E	F	G	H	I
*/

public class Q79_Pattern_79
{
	public static void main(String X[])
	{
		int i, j, A;
		
		for(i = 1; i <= 5; i++)
		{
			System.out.println();
			A = 64 + i;

			for(j = 1; j <= 5; j++)
			{
				if(i == 5 || i == j || j == 1)
				{
					System.out.print((char)A + "     ");
					A++;
				}
				else
				{
					System.out.print("      ");
				}
			}
		}
	}
}
