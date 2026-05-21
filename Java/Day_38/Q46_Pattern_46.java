/*
Q46. Write a java program to print this pattern.

					1
				2		2
			3				3
		4						4
	5								5
		4						4
			3				3
				2		2
					1
*/

public class Q46_Pattern_46
{
	public static void main(String X[])
	{
		int i, j;
		int k = 01;

		for(i = 1; i <= 9; i++)
		{
			for(j = 1; j <= 9; j++)
			{
				if(i <= 5 && (j == 4 + i || j == 6 - i))
				{
					System.out.print(k + "   ");
				}
				else if(i > 5 && (i - j == 4 || i + j == 14)) 
				{
					System.out.print(k + "  ");
				}
				else
				{
					System.out.print("    ");
				}
			}
			
			System.out.println();
			if(i < 5)
			{
				k++;
			}
			else
			{
				k--;
			}
		}
	}
}