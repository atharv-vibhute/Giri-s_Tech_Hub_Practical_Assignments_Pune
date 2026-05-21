/*
Question 71: Print Upper Triangular Matrix
Description:
Print elements where j ? i.
Input:
n = 3

Output:
1
1 1
1 1 1

Time Complexity: O(n²)

Asked In Companies:
Practice assignment
*/

public class Q71_Upper_Triangular_Matrix
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		matrix(n);
	}

	public static void matrix(int n)
	{
		int i, j;
		for(i = 1; i <= n; i++)
		{
			for(j = 1; j <= i; j++)
			{
				System.out.print("1 ");
			}
			System.out.println();
		}
	}
}