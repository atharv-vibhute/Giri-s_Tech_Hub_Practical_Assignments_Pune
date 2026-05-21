/*
Q6. Write a recursive function that prints numbers from 1 to N.
Explanation:
The function should print the current number.
It should call itself with the next number.
Stop when the number becomes greater than N.
Example:
 Input: N = 5
 Output: 1 2 3 4 5
*/
public class Q6_Function_Recursion_Print_N_Value
{
	public static void main(String X[])
	{
		long n = Long.parseLong(X[0]);
		N_Value(1, n);
	}
	public static void N_Value(long i, long n)
	{
		if(i == n) System.out.print(i + " ");
		else 
		{
			System.out.print(i + " ");
			N_Value(i + 1, n);
		}
	}
}