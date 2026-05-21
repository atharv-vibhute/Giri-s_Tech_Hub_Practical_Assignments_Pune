/*
Question 59: Nested Loop with Fixed Inner Loop
Description:
Outer loop runs from 1 to n.
Inner loop runs exactly 5 times.
Input:
n = 4

Output:
Total iterations = 4 × 5 = 20

Explanation:
Inner loop is constant (5 times).
So total operations = 5n

Time Complexity: O(n)

Asked In Companies:
Practice assignment
*/

public class Q59_Nested_Loop_Interations
{
	public static void main(String X[])
	{
		int i;
		int j = 5;
		int c = 0;
		int n = Integer.parseInt(X[0]);
		for(i = 1; i <= n; i++)
		{
			c = c + j;
		}
		System.out.println("Total iterations = " + n + " x " + j + " = " + c);
	}
}