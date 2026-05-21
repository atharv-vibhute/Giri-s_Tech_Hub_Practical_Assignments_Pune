/*
Q8. Create a recursive function that returns the sum of first N natural numbers.
Explanation:
Add current number with the sum of previous numbers.
Base condition: when N becomes 0, return 0.
Example: Input: N = 4	Output: 10
*/
public class Q8_Function_Recursion_First_N_Natural_Number_Sum
{
	public static void main(String X[])
	{
		long n = Long.parseLong(X[0]);
		System.out.println(first_n_natural_number_sum(n));
	}
	public static long first_n_natural_number_sum(long n)
	{
		if(n == 0) return 0;
		else return n + first_n_natural_number_sum(n - 1);
	}
}
