/*
Q73. Write a java program to print this pattern.
		
	A	B	C	D	E
		1	2	3	4
			A	B	C
				1	2
					A
*/

public class Q73_Pattern_73
{
	public static void main(String X[])
	{
		int i, j, A, k;
		for(i = 1; i <= 5; i++)
		{
			System.out.println();
			k = 1;
			A = 65;

			for(j = 1; j <= 5; j++)
			{
				if(i <= j && i % 2 == 0)
				{
					System.out.print(k + "   ");
					k++;
				}
				else if(i <= j && i % 2 != 0)
				{
					System.out.print((char)A + "   ");
					A++;
				}
				else
				{
					System.out.print("    ");
				}
			}
		}
	}
}