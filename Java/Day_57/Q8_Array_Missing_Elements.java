/*
Q8. Write a java program to find missing elements in an array.
Input : Array = {1, 2, 4, 5, 7} (numbers from 1 to 7 should be present)
Output : Missing elements = {3, 6}
Explanation:
Check sequence numbers one by one. If a number from 1 to maximum (7) is not in the array, it is missing.
*/
import java.util.Scanner;

public class Q8_Array_Missing_Elements
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int s = sc.nextInt();
		int a[] = new int[s];

		int m = Integer.MIN_VALUE;
		int n = Integer.MAX_VALUE;
		boolean f;
		int i, j;

		System.out.println("Enter the element of the array: ");
		for(i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();

			if(a[i] > m)
			{
				m = a[i];
			}

			if(a[i] < n)
			{
				n = a[i];
			}
		}

		sc.close();
		System.out.print("Missing elements: ");

		for(i = n; i <= m; i++)
		{
			f = true;

			for(j = 0; j < a.length; j++)
			{
				if(i == a[j])
				{
					f = false;
					break;
				}
			}

			if(f)
			{
				System.out.print(i + " ");
			}
		}
	}
}