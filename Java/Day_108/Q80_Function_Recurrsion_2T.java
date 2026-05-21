/*
Question 80: Solve Recurrence: T(n) = 2T(n/2) + n
Description:
Solve using Master Theorem.
Input:
n = 8

Output:
Time Complexity = O(n log n)

Explanation:
a = 2
b = 2
f(n) = n

Since:
n^(log_b a) = n^(log?2) = n¹ = n

This matches case 2 of Master Theorem.

Time Complexity: O(n log n)

Asked In Companies:
Practice assignment
*/

public class Q80_Function_Recurrsion_2T
{
	public static int T(int n)
	{
		if(n <= 1) return 1;
		else return 2 * T(n / 2) + n;
	}

	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		System.out.println(T(n));
	}
}

