/*
Question 57: Count Iterations of a Simple Loop
Description:
You are given an integer n. A loop runs from 1 to n and prints each number.
You must determine how many times the loop executes and analyze its time complexity.
Input:
n = 5

Output:
1 2 3 4 5
Total iterations: 5

Explanation:
The loop runs exactly n times.
If n = 5 ? 5 iterations
If n = 100 ? 100 iterations

Time Complexity: O(n)
Because execution grows linearly with input size.

Asked In Companies:
Practice assignment
*/

import java.util.Scanner;

public class Q57_Array_Count_Interations
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int s = sc.nextInt();
		int a[] = new int[s];
		int i;
		int c = 0;

		System.out.println("Enter the array elements: ");
		for(i = 0; i < s; i++)
		{
			a[i] = sc.nextInt();
			c++;
		}
		sc.close();

		for(i = 0; i < s; i++)
		{
			System.out.print(a[i] + " ");
		}	
		System.out.println("\nTotal iterations: " + c);
	}
}