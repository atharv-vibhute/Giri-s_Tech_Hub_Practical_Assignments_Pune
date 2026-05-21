/*
Question 76: Print Multiplication Table up to n
Description:
Print multiplication tables from 1 to n.
Input:
n = 3

Output:
1 × 1 = 1
1 × 2 = 2
...
3 × 10 = 30

Explanation:
Outer loop runs n times.
Inner loop runs 10 times (constant).

Total operations = 10n

Time Complexity: O(n)
(If table goes up to n instead of 10 ? then O(n²))

Asked In Companies:
Practice assignment
*/
import java.util.Scanner;

public class Q76_Function_Multiplication_Table
{
	public static void table(int n)
	{
		int i, j;
		for(i = 1; i <= n; i++)
		{
			for(j = 1; j <= 10; j++) System.out.println(i + " x " + j + " = " + i * j);
				
			System.out.println();
		}
	}

	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(X[0]);
		table(n);
	}
}