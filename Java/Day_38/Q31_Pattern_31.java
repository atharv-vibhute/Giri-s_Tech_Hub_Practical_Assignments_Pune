/*
Q31. Write a java program to print this pattern.

					*
				#	#
			*	*	*
		#	#	#	#
	*	*	*	*	*
*/

public class Q31_Pattern_31
{
	public static void main(String X[])
	{
		int i, j;
		for(i = 1; i <= 5; i++)
		{
			System.out.println();
			for(j = 1; j <= 5; System.out.print((i + j < 6)? "     " : (i % 2 == 0)? "  #  " : "  *  "), j++);
		}
	}
}