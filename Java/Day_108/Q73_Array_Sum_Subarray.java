/*
Question 73: Sum of All Subarrays
Description:

Given an array of size n, calculate the sum of all possible subarrays.

A subarray is a contiguous part of an array.
Input:
n = 3
Array = [1, 2, 3]

Output:
Subarrays:
[1] ? 1
[1,2] ? 3
[1,2,3] ? 6
[2] ? 2
[2,3] ? 5
[3] ? 3

Total Sum = 20

Explanation:
We use two loops:
First loop selects starting index.
Second loop selects ending index and keeps adding elements.

Number of subarrays = n(n+1)/2
For n=3 ? 6 subarrays.

Time Complexity: O(n²)
Because two nested loops generate all subarra

Asked In Companies:
Practice assignment
*/
import java.util.Scanner;

public class Q73_Array_Sum_Subarray
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		int i, j, k, s, b;
		
		System.out.println("Enter the size of the array: ");
		s = sc.nextInt();
		int[] a = new int[s];

		System.out.println("Enter the array element: ");
		for(i = 0; i < s; i++) a[i] = sc.nextInt();

		for(i = 0; i < s; i++)
		{
			for(j = i; j < s; j++)
			{
				b = 0;
				for(k = i; k <= j; k++) 
				{
					System.out.print(a[k] + " ");
					b += a[k];
				}
			 	System.out.println("- Sum: " + b);
			}
		}
	}
}