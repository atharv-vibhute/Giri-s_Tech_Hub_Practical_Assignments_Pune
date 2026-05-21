/*
Q26. Write a java program to print this pattern.

	*						*
	*	*				*
	*	*	*		*
	*	*	*	*
	*	*	*	*	*
	*	*	*	*	*	*
	*	*	*	*	*	*	*
*/

public class Q26_Pattern_26
{
	public static void main(String X[])
	{
		int i, j;
		for(i = 1; i <= 7; i++)
		{
			System.out.println();
			for(j = 1; j <= 7; System.out.print((i >= j || i + j == 8)? "  *  " : "     "), j++);
		}
	}
}