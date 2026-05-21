/*
Q52. Write a java program to display following series :
           	2   729   4   512   6   343   8   216   10   125   12   64   14   27   16   8   18   1 
*/

public class Q52_Series
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		int i;
		int j = 1;
		int k = 9;
		for(i = 1; i <= n; i++)
		{
			if(i % 2 == 0)
			{
				System.out.print(k * k * k + " ");
				k--;
			}
			else
			{
				System.out.print(j * 2 + " ");
				j++;
			}
		}
	}
}
