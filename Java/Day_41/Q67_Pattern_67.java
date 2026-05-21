/*
Q67. Write a java program to print this pattern.

	A	B	C	D	E
	    A	    B	    C      D
		A	B	C
		    A	    B
			A
*/

public class Q67_Pattern_67
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
				if(((i <= j && i + j <= 10) || i == 1) && ((i + j) % 2 == 0))
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