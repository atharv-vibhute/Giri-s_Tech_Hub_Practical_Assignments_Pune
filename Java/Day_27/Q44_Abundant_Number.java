/*
Q44. Write a Java program to find all Abundant numbers up to n.
 An Abundant number is a number for which the sum of its proper divisors is greater than the number itself.
 Example: 12 is abundant because its proper divisors are 1, 2, 3, 4, 6 → sum = 16 > 12.
Explanation:
 Use nested loops: outer for numbers from 1 to n; inner for finding proper divisors and summing them. Compare sum with the number.
*/

public class Q44_Abundant_Number
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		int i, j, s;

		for(i = 2; i <= n; i++)
		{
			s = 0;
			for(j = 1; j < i; j++)
			{
				if(i % j == 0)
				{
					s = s + j;
				}
			}
			if(s > i)
			{
				System.out.println(i);
			}
		}
	}
}