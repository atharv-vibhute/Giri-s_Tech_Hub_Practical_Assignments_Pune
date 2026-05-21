/*
Q39. Write a java program to print this pattern.

	5	*	5	*	5
	4	*	4	*
	3	*	3
	2	*
	1
*/

public class Q39_Pattern_39
{
	public static void main(String X[])
	{
		int i, j;
		for(i = 5; i >= 1; i--)
		{
			System.out.println();
			for(j = 1; j <= i; System.out.print((j % 2 == 0)? "   *   " : "   " + i + "   "), j++);
		}
	}
}