/*
Q30. Write a java program to print this pattern.

	*	*	*	*	*	*	*
	*	*				*	*
	*		*		*		*
	*			*			*
	*		*		*		*
	*	*				*	*
	*	*	*	*	*	*	*
*/

public class Q30_Pattern_30
{
	public static void main(String X[])
	{
		int i, j;
		for(i = 1; i <= 7; i++)
		{
			System.out.println();
			for(j = 1; j <= 7; System.out.print((i == 1 || i == 7 || j == 1 || j ==7 || i == j || i + j == 8)? "  *  " : "     "), j++);
		}
	}
}