/*
Q28. Write a java program to find the union array of two unsorted arrays.
	Input :-  arr1 = [1, 2, 3]  
   arr2 = [2, 3, 4, 5]
	Output :- [1, 2, 3, 4, 5]
Explanation:
Union combines all elements from both arrays.
Duplicates are removed to keep only unique
*/
import java.util.Scanner;

public class Q28_Array_Union
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		int i, j, k;
		boolean f;

		System.out.println("Enter the size of the first array: ");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the first array elements: ");
		for(i = 0; i < n; i++)
		{
			a[i] = sc.nextInt();
		}

		System.out.println("Enter the size of the second array: ");
		int m = sc.nextInt();
		int b[] = new int[m];
		System.out.println("Enter the second array elements: ");
		for(j = 0; j < m; j++)
		{
			b[j] = sc.nextInt();
		}

		int c[] = new int[n + m];

		for(i = 0; i < n; i++)
		{
			c[i] = a[i];
		}

		k = n;
		for(i = 0; i < m; i++)
		{
			f = true;

			for(j = 0; j < n; j++)
			{
				if(b[i] == a[j])
				{
					f = false;
					break;
				}
			}

			if(f)
			{
				c[k] = b[i];
				k++;
			}
		}

		System.out.print("\n[");
		for(i = 0; i < k; i++)
		{
			if(i == k - 1)
			{
				System.out.print(c[i] + "]");
			}
			else
			{
				System.out.print(c[i] + ", ");
			}
		}
	}
}