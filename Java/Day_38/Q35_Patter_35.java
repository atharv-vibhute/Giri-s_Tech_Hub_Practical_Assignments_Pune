/*
35. Write a java program to print this pattern.

	5	4	3	2	1
		4	3	2	1
			3	2	1	
				2	1	
					1
*/

public class Q35_Patter_35
{
	public static void main(String X[])
	{
		int i, j;
		int k = 6;
		for(i = 1; i <= 5; i++)
		{
			System.out.println();
			for(j = 1; j <= 5; System.out.print((i <= j)? (k - j) + "    " : "     "), j++);
		}
	}
}