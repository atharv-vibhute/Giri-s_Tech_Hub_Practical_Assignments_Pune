/*
Q81. Write a java program to print this pattern.

A	B	C	D	E	D	C	B	A
A								A
A								A
A								A
A								A
*/

public class Q81_Pattern_81
{
	public static void main(String X[])
	{
		int i, j, A;

		for(i = 1; i <= 5; i++)
		{
			System.out.println();
			A = 65;

			for(j = 1; j <= 9; j++)
			{
				if(i == 1 || j == 1 || j == 9)
				{
					if(j < 5)
					{
						System.out.print((char)A + "    ");
						A++;
					}
					else if(j == 5 && i == 1)
					{
						System.out.print((char)A + "    ");						
					}
					else
					{
						A--;
						System.out.print((char)A + "    ");
					}
				}
				else
				{
					System.out.print("     ");
				}
			}
		}
	}
}