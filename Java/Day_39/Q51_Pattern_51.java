/*
Q51. Write a java program to print this pattern.

	1	2	3	4	#
	1	2	3	#	5
	1	2	#	4	5
	1	#	3	4	5
	#	2	3	4	5
*/

public class Q51_Pattern_51
{
	public static void main(String X[])
	{
		int i, j;
		for(i = 1; i <= 5; i++)
		{
			System.out.println();
			for(j = 1; j <= 5; System.out.print((i + j == 6)? "  #  " : "  " + i + "  "), j++);
		}
	}
}
