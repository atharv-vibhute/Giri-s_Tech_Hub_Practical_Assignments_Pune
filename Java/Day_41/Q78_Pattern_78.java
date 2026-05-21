/*
Q78. Write a java program to print this pattern.

A	B	C	D	E	D	C	B	A	
A	B	C	D	  	D	C	B	A	
A	B	C    				C	B	A
A	B     						B	A
A       							A
A	B     						B	A
A	B	C   				C	B	A
A	B	C	D 		D	C	B	A
A	B	C	D	E	D	C	B	A
*/

public class Q78_Pattern_78
{
	public static void main(String X[])
	{
		int i, j, A;

		for(i = 1; i <= 9; i++)
		{
			System.out.println();
			A = 65;

			for(j = 1; j <= 9; j++)
			{
				if(j < 5 && (i + j <= 6 || i - j > 3))
				{
					System.out.print((char)A + "     ");
					A++;
				}
				else if(j > 5 && (j - i >= 4 || i + j >= 14))
				{
					A--;
					System.out.print((char)A + "     ");
				}
				else if(j == 5 && (i == 1 || i == 9))
				{
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