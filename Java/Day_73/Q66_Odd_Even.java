/*
Question 66: Check if Number is Even
Description:
Check if a number is even or odd.
Input:
n = 25

Output:
Odd

Explanation:
Only one operation.

Time Complexity: O(1)

Asked In Companies:
Practice assignment
*/

public class Q66_Odd_Even
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		System.out.println((n % 2 == 0)? "Even" : "Odd");
	}
}
