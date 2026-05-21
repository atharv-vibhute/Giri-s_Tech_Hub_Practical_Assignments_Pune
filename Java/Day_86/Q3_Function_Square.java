/*
Q3. Write a Java method that accepts a number and returns its square.
Explanation
Square means number × number
The method calculates and returns the result
Method Signature - static int square(int n)
Input - n = 5
Output - Square = 25
*/
public class Q3_Function_Square
{
	public static void main(String X[])
	{
		long n = Long.parseLong(X[0]);
		System.out.println("Square = " + square(n));
	}
	public static long square(long n) 
	{
		return n * n;
	}
}