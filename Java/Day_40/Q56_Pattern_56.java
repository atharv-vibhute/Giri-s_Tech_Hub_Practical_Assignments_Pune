/*
Q56. Write a java program to print this pattern.

		1
            1	    1
        1	2	1
    1	    3       3       1
1	4	6	4	1
*/

public class Q56_Pattern_56
{
	public static void main(String X[])
	{
		int i, j, k, t, p;
		
		for(i = 1; i <= 5; i++)
		{
			p = 11;
			System.out.println();

			for(k = 2; k < i; k++)
			{
				p = p * 11;
			}
			t = p;

			for(j = 1; j <= 9; j++)
			{
				if(6 - i <= j && 4 + i >= j && (i + j) % 2 == 0)
				{
					k = t % 10;
					t = t / 10;
					System.out.print(k + "    ");
				}
				else
				{
					System.out.print("     ");
				}
			}
		}
	}
}