/*
Q69. Write a java program to print this pattern.

	1
	A	B
	1	2	3
	A	B	C	D
	1	2	3	4	5
*/

public class Q69_Pattern_69
{
	public static void main(String X[])
	{
		int i, j, A;
	
		for(i = 1; i <= 5; i++)
		{
			System.out.println();
			A = 65;

			for(j = 1; j <= 5; j++)
			{
				if(i >= j)
				{
					if(i % 2 == 0)
					{
						System.out.print((char)A + "     ");
						A++;
					}
					else
					{
						System.out.print(j + "     ");
					}
				}
			}
		}
	}
}