/*
Q3. Write a function that accepts an integer N and prints numbers from 1 to N.
Explanation
Function receives value of N
Use a loop inside the function
Print numbers one by one
Example
Input: 5      — 1 2 3 4 5
*/
public class Q3_Function_Print_Numbers
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		print_number(n);
	}
	public static void print_number(int n)
	{
		int i;
		for(i = 1; i <= n; i++) System.out.print(i + " ");
	}
}

