/*
Question 61: Loop that Divides n by 2 Each Time
Description:
Given n, divide n by 2 until it becomes 1.
Input:
n = 16

Output:
16 ? 8 ? 4 ? 2 ? 1
Total steps: 4

Explanation:
Each iteration halves the value.
Number of steps = log?(n)

Time Complexity: O(log n)

Asked In Companies:
Practice assignment
*/

public class Q61_Divide_Upto_1
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		int c = 0;
		System.out.print(n + " ? ");
		while(n > 1)
		{
			n = n / 2;
			c++;
			System.out.print(n + " ? ");
		}
		System.out.println("\nTotal steps: " + c);
	}
}