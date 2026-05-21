/*
Q55. Write a java program to display following series :
           	5  3  10  6  15  9  20  12  25  15  30  18  35  21  40
*/

public class Q55_5_3_Table_Series
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		int i;
		int a = 5;
		int b = 3;
		int x = 0;
		int y = 0;
		for(i = 1; i <= n; i++)
		{
			if(i % 2 == 0)
			{
				x = x + b;
				System.out.print(x + " "); 
			}
			else
			{
				y = y + a;
				System.out.print(y + " ");
			}
		}
	}
}