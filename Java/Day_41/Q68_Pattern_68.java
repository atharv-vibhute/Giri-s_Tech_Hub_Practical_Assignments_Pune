/*
Q68. Write a java program to print this pattern.
	
	A	1	2	3	4
	A	B	1	2	3
	A	B	C	1	2
	A	B	C	D	1
	A	B	C	D	E
*/

public class Q68_Pattern_68
{
	public static void main(String X[])
	{
		int i, j, k, A;
		
		for(i = 1; i <= 5; i++)
		{
			System.out.println();
			A = 65;
			k = 1;

			for(j = 1; j <= 5; j++)
			{
				if(i >= j)
				{
					System.out.print((char)A + "   ");
					A++;
				}
				else
				{
					System.out.print(k + "   ");
					k++;
				}
			}		
		}
	}
}