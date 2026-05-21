/*
Q58. Write a Java program to display the following series:
2 6 12 20 30 42 56 72 90 110
(n(n+1) pattern multiplied by 2)*
*/

public class Q58_Series
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		int a = 2;
		int i;
		for(i = 2; i <= n; i++)
		{
			System.out.print(a + " ");
			a = a + i * 2;
		}
	}
}
