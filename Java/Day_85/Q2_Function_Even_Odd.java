/*
Q2. Write a function that accepts one integer and prints whether the number is Even or Odd.
Explanation
Use modulo operator %
If number % 2 == 0, print Even
Otherwise, print Odd
No return value used
Example
Input: 7        Output: Number is Odd
*/
public class Q2_Function_Even_Odd
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		Even_Odd(n);
	}
	public static void Even_Odd(int n)
	{
		System.out.println((n % 2 == 0)? "Number is Even" : "Number is Odd");
	}
}
