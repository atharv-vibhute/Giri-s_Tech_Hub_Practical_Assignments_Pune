/*
Q75. Write a java program to print this pattern.

									A
                                                        1	2	1
                                        A	B	C	B	A
                        1	2	3	4	3	2	1
       A	B	C	D	E	D	C	B	A
*/

public class Q75_Pattern_75
{
	public static void main(String X[])
	{
		int i, j, A, k;

		for(i = 1; i <= 5; i++)
		{
			System.out.println();
			A = 65;
			k = 1;

			for(j = 1; j <= 9 ; j++)
			{
				if(i % 2 == 0 && 10 - i * 2 < j)
				{
					if(i + j < 10)
					{
						System.out.print(k + "   ");
						k++;
					}
					else
					{
						System.out.print(k + "   ");
						k--;
					}
				}
				else if(i % 2 != 0 && 10 - i * 2 < j)
				{
					if(i + j < 10)
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
				else
				{
					System.out.print("    ");
				}
			}
		}
	}
}