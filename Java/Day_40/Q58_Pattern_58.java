/*
Q58. Write a java program to print this pattern.

1       								9
         2     						8
  		3				7
   			4		6
                                5
   			4 		6
  		3   				7
         2     						8
1       								9
*/

public class Q58_Pattern_58
{
	public static void main(String X[])
	{
		int i, j;
		int k = 9;

		for(i = 1; i <= 9; i++)
		{
			System.out.println();
			

			for(j = 1; j <=9; j++)
			{
				if(i == j && i != 5)
				{
					System.out.print(i + "   ");
				}
				else if(i + j == 10)
				{
					System.out.print(k + "   ");
					k--;
				}
				else
				{
					System.out.print("    ");
				}
			}
		}
	}
}