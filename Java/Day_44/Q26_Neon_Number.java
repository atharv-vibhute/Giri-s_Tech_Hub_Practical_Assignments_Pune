/*
Q26. Write a java program to Check Number Is Neon Number or Not.
Example : A neon number is a number where the sum of digits of the square of the number is equal to the number.
*/

public class Q26_Neon_Number
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		int s = n * n;
		int a = 0;
		int d;

		do
		{
			d = s % 10;
			a = a + d;
			s = s / 10;
		} while(s != 0);

		System.out.println((a == n)? "Neon Number" : "Not Neon Number");
	}
}