/*
Q54. Write a java program to display following series :
           	1  2  4  7  11  16  22  29  37  46.
*/

public class Q54_Series_Addition
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		int r = 1;
		int i;
		for(i = 0; i < n; i++)
		{
			r = r + i;
			System.out.print(r + " ");
		}
	}
}
