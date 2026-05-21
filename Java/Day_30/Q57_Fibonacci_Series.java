/*
Q57. Write a Java program to display the following series:
     1 1 2 3 5 8 13 21 34
(Fibonacci series using loop — first 9 terms)
*/

public class Q57_Fibonacci_Series
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		int f = 1;
		int s = 1;
		int a;
		int i;
		System.out.print(f + " " + s);
		for(i = 3; i <= n; i++)
		{
			a = f + s;
			f = s;
			s = a;
			System.out.print(" " + a);
		}
	}
}