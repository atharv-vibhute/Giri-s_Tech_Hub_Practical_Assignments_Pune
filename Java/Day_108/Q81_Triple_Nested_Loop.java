/*
Question 81: Triple Nested Loop
Description:
Three nested loops each running from 1 to n.
Input:
n = 2

Output:
Total iterations = 2 × 2 × 2 = 8

Explanation:
Outer loop ? n
Middle loop ? n
Inner loop ? n

Total operations = n³

Time Complexity: O(n³)

Asked In Companies:
Practice assignment
*/

public class Q81_Triple_Nested_Loop
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		int i, j, k;
		int c = 0;
		for(i = 0; i < n; i++)
		{
			for(j = 0; j < n; j++)
			{
				for(k = 0; k < n; k++) c++;
			}
		}
		System.out.println(c);
	}
}