/*
Q27. Write a java program to count the frequency of each element in a given array.
Input:
Array = {1, 2, 2, 3, 3, 3, 4}
Output:
 1 → 1 time
 2 → 2 times
 3 → 3 times
 4 → 1 time
Explanation:
For each element, count how many times it occurs in the array using nested traversal.
*/
import java.util.Scanner;

public class Q27_Array_Element_Frequency
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int s = sc.nextInt();
		int a[] = new int[s];
		int m = Integer.MAX_VALUE;
		int n = Integer.MIN_VALUE;
		int i, j, f;
		
		System.out.println("Enter the array elements: ");
		for(i = 0; i < s; i++)
		{
			a[i] = sc.nextInt();
			
			if(a[i] < m)
			{
				m = a[i];
			}

			if(a[i] > n)
			{
				n = a[i];
			}
		}
		sc.close();

		for(i = m; i <= n; i++)
		{
			f = 0;

			for(j = 0; j < s; j++)
			{
				if(i == a[j])
				{
					f++;
				}
			}

			if(f > 1)
			{
				System.out.println(i + " -> " + f + " times");
			}
			else if(f == 1)
			{
				System.out.println(i + " -> " + f + " time");
			}
		}
	}
}