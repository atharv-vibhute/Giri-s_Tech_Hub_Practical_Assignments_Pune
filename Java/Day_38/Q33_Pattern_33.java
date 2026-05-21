/*
Q33. Write a java program to print this pattern.

	1	2	3	4	5
	2	3	4	5	6
	3	4	5	6	7
	4	5	6	7	8
	5	6	7	8	9
*/

public class Q33_Pattern_33
{
	public static void main(String X[])
	{
		int i, j;
		int k = 0;
		for(i = 1; i <= 5; i++)
		{
			System.out.println();
			for(j = 1; j <= 5; System.out.print((j + k) + "   "), j++);
			k++;
		}
	}
}