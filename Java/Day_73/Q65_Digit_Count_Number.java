/*
Question 65: Count Digits in a Number
Description:
Given integer n, count number of digits using division by 10.
Input:
n = 12345

Output:
Digits = 5

Explanation:
Each step removes one digit.

Time Complexity: O(log n)

Asked In Companies:
Practice assignment
*/

public class Q65_Digit_Count_Number
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		int c = 0;
		while(n > 0)
		{
			n = n / 10;
			c++;
		}
		System.out.println("Digits = " + c);
	}
}