/*
Question 79: Solve Recurrence: T(n) = T(n/2) + 1
Description:
Solve recurrence relation.
Input:
n = 16

Output:
T(16) = log?(16) = 4

Explanation:
Each step halves the input size.

Number of times we divide by 2:
n ? n/2 ? n/4 ? n/8 ? ... ? 1

Total steps = log?(n)

Time Complexity: O(log n)

Asked In Companies:
Practice assignment
*/

public class Q79_Function_Recurrsion_Log
{
	public static int log(int n)
	{
		if(n <= 1) return 0;
		else return log(n / 2) + 1;
	}
	
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		System.out.println(log(n));
	}
}