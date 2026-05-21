/*
Q29.Write a Java program to find quotients and remainder using arithmetic operators.
Input	:  Dividend = 20	Divisor = 3
Output   :  Quotient = 6	Remainder = 2
Explanation	:  Division and modulus are used.
*/

public class Q29_Division
{
	public static void main(String X[])
	{
		int dd = Integer.parseInt(X[0]);
		int dr = Integer.parseInt(X[1]);
		int q = dd / dr;
		int r = dd % dr;
		System.out.println("Quotient = " + q + "\tRemainder = " + r);
	}
}