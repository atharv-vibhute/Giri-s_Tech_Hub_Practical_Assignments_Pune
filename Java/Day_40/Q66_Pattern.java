/*
Q66. Write a java program to print this pattern.

			A
		    A       B
		A	B	C
	    A	    B	    C	    D
	A	B	C	D	E
*/

public class Q66_Pattern
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
				if(6 - i <= j && 4 + i >= j && (i + j) % 2 == 0)
				{
					System.out.print((char)A + " ");
					A++;
				}
				else
				{
					System.out.print("  ");
				}
			}
		}
	}
}