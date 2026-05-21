/*
Q45. Write a Java program to print all Pronic numbers between 1 and n.
 A Pronic number is the product of two consecutive integers, i.e., n(n+1).
 Example: 2 (1×2), 6 (2×3), 12 (3×4) etc.
Explanation:
 Use a loop to check for each number from 1 to n. For each, use another loop to find if it can be expressed as x*(x+1).
*/

public class Q45_Pronic_Numbers
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		int i, j, k;
		for(k = 1; k <= n; k++)
		{
			for(i = 1; i <= (k/2); i++)
			{
				j = i + 1;
				if(i * j == k)
				{
					System.out.println(k);
				}
			}
		}
	}
}