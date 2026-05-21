/*
Q60. Write a Java program to display the following series: 
3   6   12   24   48   96  192 
(Each term doubles from the previous term starting at 3)
*/

public class Q60_Double_Series
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		int i;
		int a = 3;
		for(i = 0; i < n; i++)
		{
			System.out.print(a + " ");
			a = a * 2;
		}
	}
}
