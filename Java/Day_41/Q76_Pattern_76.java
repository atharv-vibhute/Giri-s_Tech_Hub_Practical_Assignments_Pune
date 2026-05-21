/*
Q76. Write a java program to print this pattern.

					A
				#	#	#
                        A	B	C	B	A
		#	#	#	#	#	#	#
	A	B	C	D	E	D	C	B	A
		#	#	#	#	#	#	#
			A	B	C	B	A
				#	#	#
					A
*/

public class Q76_Pattern_76
{
	public static void main(String X[])
	{
		int i, j, A;

		for(i = 1; i <= 9; i++)
		{
			System.out.println();
			A = 65;

			for(j = 1; j <= 9; j++)
			{
				if(i <= 5 && i % 2 == 0)
				{
					if(6 - i <= j && 4 + i >= j)
					{
						System.out.print("   #   ");
					}
					else
					{
						System.out.print("       ");
					}
				}
				else if(i <= 5 && i % 2 != 0)
				{
					if(6 - i <= j && 4 + i >= j && j < 5)
					{
						System.out.print("   " + (char)A + "   ");
						A++;
					}
					else if(6 - i <= j && 4 + i >= j && j >= 5)
					{
						System.out.print("   " + (char)A + "   ");
						A--;
					}	
					else
					{
						System.out.print("       ");
					}		
				}
				else if(i > 5 && i % 2 == 0)
				{
					if(i - j <= 4 && i + j <= 14)
					{
						System.out.print("   #   ");
					}
					else
					{
						System.out.print("       ");
					}
				}
				else if(i > 5 && i % 2 != 0)
				{
					if(i - j <= 4 && i + j <= 14 && j < 5)
					{
						System.out.print("   " + (char)A + "   ");
						A++;
					}
					else if(i - j <= 4 && i + j <= 14 && j >= 5)
					{
						System.out.print("   " + (char)A + "   ");
						A--;
					}	
					else
					{
						System.out.print("       ");
					}		
				}
				else
				{
					System.out.print("       ");
				}
			}
		}
	}
}