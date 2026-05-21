/*
Q51. Write a java program to display following series :
           	1  2  2  4  3  6  4  8  5  10  6  12
*/

public class Q51_Series
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		int i;
		int j = 1;
		for(i = 1; i <= n; i++)
		{
			if(i % 2 == 0)
			{
				System.out.print(i + " ");
			}
			else
			{
				System.out.print(j + " ");
				j++;
			}
		}
	}
}


