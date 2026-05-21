/*
Q15. Write a java program to print this pattern.

		#	#	#	#	#
		#	#
		#		#
		#			#
		#
*/

public class Q15_Pattern_16
{
	public static void main(String X[])
	{
		int i, j;
		for(i = 1; i <= 5; i++)
		{
			System.out.println();
			for(j = 1; j <= 5; System.out.print((i == 1 || j == 1 || i == j)? "  #  " : "     "), j++);
		}
	}
}