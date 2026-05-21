
/*
Q59. Write a Java program to display the following series: 
100   81   64   49   36   25   16   9   4   1 
(Perfect squares in reverse order)
*/

public class Q59_Square_Reverse_Series
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		int i;
		for(i = n; i > 0; i--)
		{
			System.out.print(i * i + " ");
		}
	}
}