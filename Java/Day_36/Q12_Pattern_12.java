/*
Q12. Write a java program to print this pattern.

	#	# 	#	#	#
	*	*	*	*
	#	#	#
	*	*
	#
*/

public class Q12_Pattern_12
{
	public static void main(String X[])
	{
		int i, j;

		for(i = 5; i >= 1; i--)
		{
			System.out.println();

			for(j = 1; j <= 5; j++)
			{
				if(j <= i)
				{
					if(i % 2 == 0)
					{
						System.out.print(" * ");
					}
					else
					{
						System.out.print(" # ");
					}
				}
			}
		}
	}
}