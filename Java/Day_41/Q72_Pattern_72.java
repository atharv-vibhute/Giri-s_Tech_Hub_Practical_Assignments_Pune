/*
Q72. Write a java program to print this pattern.

	A								I
               B						H
                       C				G
                               D		F
                                        E	
*/

public class Q72_Pattern_72
{
	public static void main(String X[])
	{
		int i, j, A;

		for(i = 1; i <= 5; i++)
		{
			System.out.println();

			for(j = 1; j <= 9; j++)
			{
				A = 64 + j;
				if(i == j || i + j == 10)
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