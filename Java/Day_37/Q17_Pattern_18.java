/*
Q17. Write a java program to print this pattern.

					*
				*		*
			*				*
		*						*
	*	*	*	*	*	*	*	*	*
*/

public class Q17_Pattern_18
{
	public static void main(String X[])
	{
		int i, j;
		for(i = 1; i <= 5; i++)
		{
			System.out.println();
			for(j = 1; j <= 9; System.out.print((i == 5 || (j + i == 6) || (j - i == 4))? "  *  " : "     "), j++);
		}
	}
}
