/*
Q21. Write a Java program to reverse a number without using a loop.
 Input : 123
 Output : 321
 Explanation : Digits are reversed using arithmetic operations.
*/

public class Q21_Reverse
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		int r = 0;
		int rn = 0;

		r = n % 10;
		rn = rn * 10 + r;
		n = n / 10;

		r = n % 10;
		rn = rn * 10 + r;
		n = n / 10;

		r = n % 10;
		rn = rn * 10 + r;
		n = n / 10;

		System.out.println(rn);
	}
}