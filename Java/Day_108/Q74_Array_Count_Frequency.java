/*
Question 74: Count Frequency of Each Element (Without Hashing)
Description:
Given an array, count how many times each element appears using nested loops (no HashMap allowed).
Input:
n = 5
Array = [1, 2, 2, 3, 1]

Output:
1 ? 2 times
2 ? 2 times
3 ? 1 time

Explanation:
For each element:
Loop through entire array again.
Count matches.

Outer loop runs n times.
Inner loop runs n times.

Time Complexity: O(n²)
Because every element is compared with every other element.

Asked In Companies:
Practice assignment
*/
import java.util.Scanner;

public class Q74_Array_Count_Frequency
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		int i, j, s, c;
		int m = Integer.MAX_VALUE;
		int n = Integer.MIN_VALUE;

		System.out.println("Enter the size of the array: ");
		s = sc.nextInt();
		int[] a = new int[s];

		System.out.println("Enter the array elements: ");
		for(i = 0; i < s; i++) 
		{
			a[i] = sc.nextInt();
			if(a[i] < m) m = a[i];
			if(a[i] > n) n = a[i];
		}
		sc.close();

		for(j = m; j <= n; j++)
		{
			c = 0;

			for(i = 0; i < s; i++) if(j == a[i]) c++;
			
			if(c > 0) System.out.println(j + " - " + c + " times");
		}
	}
}