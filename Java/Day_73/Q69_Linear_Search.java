/*
Question 69: Linear Search
Description:
Search target in array.
Input:
Array: [4,7,2,9]
Target = 2

Output:
Found

Explanation:
Worst case checks all elements.

Time Complexity: O(n)

Asked In Companies:
Practice assignment
*/

import java.util.Scanner;

public class Q69_Linear_Search
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		int s, i, t;
		boolean f = false;

		System.out.println("Enter the size of the array: ");
		s = sc.nextInt();
		int a[] = new int[s];

		System.out.println("Enter the array elements: ");
		for(i = 0 ; i < s; i++)
		{
			a[i] = sc.nextInt();
		}

		System.out.println("Enter the target element: ");
		t = sc.nextInt();
		sc.close();

		for(i = 0; i < s; i++)
		{
			if(t == a[i])
			{
				f = true;
				break;
			}
		}
		System.out.println((f)? "Found" : "Not Found");
	}
}