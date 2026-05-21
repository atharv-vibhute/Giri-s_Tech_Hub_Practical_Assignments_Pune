/*
Question 68: Find Duplicate Using Nested Loop
Description:
Check if array contains duplicate elements.
Input:
[1,2,3,2]

Output
Duplicate Found

Explanation:
Each element compared with others.

Time Complexity: O(n²)

Asked In Companies:
Practice assignment
*/

import java.util.Scanner;

public class Q68_Array_Duplicate_Element
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		int s, i, j;
		boolean f = false;
		
		System.out.println("Enter the size of the array: ");
		s = sc.nextInt();
		int a[] = new int[s];

		System.out.println("Enter the array element: ");
		for(i = 0; i < s; i++)
		{
			a[i] = sc.nextInt();

			for(j = 0; j < i; j++)
			{
				if(a[i] == a[j])
				{
					f = true;
				}
			}
		}
		sc.close();
		System.out.println((f)? "Duplicate Found" : "Duplicate Not Found");
	}
}