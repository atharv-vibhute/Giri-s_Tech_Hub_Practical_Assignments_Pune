
/*
Q53. Write a java program to display following series :
           	1  4  9  16  25  36  49  64  81  100
*/

public class Q53_Square_Series
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		int i;
		for(i = 1; i <= n; i++)
		{
			System.out.print(i * i + " ");
		}
	}
}