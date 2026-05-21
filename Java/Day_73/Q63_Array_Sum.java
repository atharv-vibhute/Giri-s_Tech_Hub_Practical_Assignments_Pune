/*
Question 63: Sum of Array Elements
Description:
Given an array of n elements, compute the sum.
Input:
n = 5
Array: [1,2,3,4,5]

Output:
Sum = 15

Explanation:
Each element is visited once.

Time Complexity: O(n)

Asked In Companies:
Practice assignment
*/
import java.util.Scanner;

public class Q63_Array_Sum
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int s = sc.nextInt();
		int a[] = new int[s];
		int n = 0;
		int i;

		System.out.println("Enter the array elements: ");
		for(i = 0; i < s; i++)
		{
			a[i] = sc.nextInt();
			n = n + a[i];
		}
		sc.close();
		System.out.println("Sum = " + n);
	}
}