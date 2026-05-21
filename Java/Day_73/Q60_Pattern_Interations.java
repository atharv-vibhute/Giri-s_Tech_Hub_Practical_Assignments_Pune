/*
Question 60: Print n² Pattern
Description:
Print an n × n matrix using nested loops.
Input:
n = 3

Output:
Total operations: 9

Explanation:
Outer loop runs n times
Inner loop runs n times

Total operations = n × n

Time Complexity: O(n²)

Asked In Companies:
Practice assignment
*/

public class Q60_Pattern_Interations
{
	public static void main(String X[])
	{
		int i, j;
		int c = 0;
		int n = Integer.parseInt(X[0]);
		for(i = 1; i <= n; i++)
		{
			for(j = 1; j <= n; j++)
			{
				c++;
			}
		}
		System.out.println("Total operations: " + c);
	}
}