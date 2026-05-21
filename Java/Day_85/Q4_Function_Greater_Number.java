/*
Q4. Write a function that accepts two integers and prints the greater number.
Explanation
Compare both numbers using if-else
Print the greater number
Function does not return anything
Example
Input: 15, 25
Output: Maximum number is 25
*/
public class Q4_Function_Greater_Number
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		int m = Integer.parseInt(X[1]);
		greater_number(n, m);
	}
	public static void greater_number(int n, int m)
	{
		System.out.println((n > m)? "Maximum number is " + n : "Maximum number is " + m);
	}
}

