/*
Q20. Write a Java program to compute the sum of digits of an integer.
Input : 123
Output : 6
Explanation : Digits are added: 1 + 2 + 3 = 6.
*/

public class Q20_Digit_Sum
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		int r = 0;
		int s = 0;

		r = n % 10;
		s = s + r;
		n = n / 10;

		r = n % 10;
		s = s + r;
		n = n / 10;

		r = n % 10;
		s = s + r;
		System.out.println(s);
	}
}