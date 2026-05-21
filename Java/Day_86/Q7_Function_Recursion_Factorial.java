/*
Q7. Write a recursive function to calculate the factorial of a given number.
Explanation:
Factorial of n is n * factorial(n-1).
Base condition: factorial of 0 or 1 is 1.
Example: Input: 5		Output: 120
*/
public class Q7_Function_Recursion_Factorial
{
	public static void main(String X[])
	{
		long n = Long.parseLong(X[0]);
		System.out.println(factorial(n));
	}
	public static long factorial(long n)
	{
		if(n == 0 || n == 1) return 1;
		else return n * factorial(n - 1);
	}
}