/*
Q20. Write a java program to print this pattern.

	*	*	*	*	*
	*			*	*
	*		*		*
	*	*			*
	*	*	*	*	*
*/

public class Q20_Pattern_21
{
	public static void main(String X[])
	{
		int i, j;
		for(i = 1; i <= 5; i++)
		{
			System.out.println();
			for(j = 1; j <= 5; System.out.print((i == 1 || i == 5 || j == 1 || j == 5 || i + j == 6)? "  *  " : "     "), j++);
		}
	}
}