/*
Question 62: Loop that Multiplies by 2 Each Time
Description:
Start from 1 and multiply by 2 until value exceeds n.
Input:
n = 32

Output:
1 2 4 8 16 32

Explanation:
Number doubles every time.
Steps ? log?(n)

Time Complexity: O(log n

Asked In Companies:
Practice assignment
*/

public class Q62_Multiply_Upto_N
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		int i = 1;
		System.out.print(i + " ");
		while(i < n)
		{
			i = i * 2;
			System.out.print(i + " ");
		}
	}
}