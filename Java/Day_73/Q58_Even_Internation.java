/*
Question 58: Print Only Even Numbers up to n
Description:
Given an integer n, print all even numbers from 1 to n using a loop that increments by 2.
Input:
n = 10

Output:
2 4 6 8 10
Total iterations: 5

Explanation:
The loop runs n/2 times.
But in Big-O notation, constants are ignored.

Time Complexity: O(n)

Asked In Companies:
Practice assignment
*/

public class Q58_Even_Internation
{
	public static void main(String X[])
	{
		int i, n;
		int c = 0;
		n = Integer.parseInt(X[0]);
		for(i = 1; i <= n; i++)
		{
			if(i % 2 == 0)
			{
				System.out.print(i + " ");
				c++;
			}
		}
		System.out.println("\nTotal iteration: " + c);
	}
}