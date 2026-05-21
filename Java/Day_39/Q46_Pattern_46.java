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
		for(i = 1; i <= 9; i++)
		{
			System.out.println();

			for(j = i; j <= 9; j++)
			{
				if(i <= 5 && 6 - i >= j && 4 + i <= j)
				{
					System.out.print(i + "       ");
				}
				else if(i > 5 && i - j <= 4 && i + j <= 10)
				{
					System.out.print(i + "       ");
				}
				else 
				{
					System.out.print("        ");
				}
			}
		}
	}
}
