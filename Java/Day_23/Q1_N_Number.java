/*
Q.1 Write a java Program to display 1 to nth natural numbers.
*/

public class Q1_N_Number
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		int i = 1;
		while(i <= n)
		{
			System.out.println(i);
			i++;
		}
	}
}