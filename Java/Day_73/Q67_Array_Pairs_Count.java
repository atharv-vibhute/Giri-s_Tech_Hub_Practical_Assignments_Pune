/*
Question 67: Count All Pairs in Array
Description:
Given array of size n, print all possible pairs (i,j).
Input:
n = 3

Output:
(1,2) (1,3) (2,3)

Explanation:
Nested loops.

Time Complexity: O(n²)

Asked In Companies:
Practice assignment
*/

public class Q67_Array_Pairs_Count
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		int i, j;
		for(i = 1; i <= n; i++)
		{
			for(j = i + 1; j <= n; j++)
			{
				
				System.out.println(i + ", " + j);
			} 
		}
	}
}