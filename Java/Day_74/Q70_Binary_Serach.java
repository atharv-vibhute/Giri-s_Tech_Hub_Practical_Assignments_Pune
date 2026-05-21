/*
Question 70: Binary Search (Sorted Array)
Description:
Search target using binary search.
Input:
[1,3,5,7,9]
Target = 7

Output:
Found

Explanation:
Each step halves search space.

Time Complexity: O(log n)

Asked In Companies:
Practice assignment
*/
import java.util.Scanner;

public class Q70_Binary_Serach
{
	public static void main(String X[])
	{
		int i, n, t, s, e, m;
		boolean f = false;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		n = sc.nextInt();
		int a[] = new int[n];
		
		System.out.println("Enter the array element in incresing order: ");
		for(i = 0; i < n; i++)
		{
			a[i] = sc.nextInt();
		}
		
		System.out.println("Enter the target element: ");
		t = sc.nextInt();
		sc.close();

		s = 0;
		e = n - 1;
		while(s <= e)
		{
			m = (s + e) / 2;

			if(a[m] < t)
			{
				s = m + 1;
			}
			else if(a[m] > t) 
			{
				e = m - 1;
			}
			else 
			{
				f = true;
				break;
			}
		}

		if(f)
		{
			System.out.println("Found");
		}
		else
		{
			System.out.println("Not Found");
		}
	}
}