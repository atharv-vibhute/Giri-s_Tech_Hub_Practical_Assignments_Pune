/*
Question 72: Print All Subarrays
Description:
Print all possible subarrays of array size n.
Input:
[1,2,3]

Output:
[1] [1,2] [1,2,3] [2] [2,3] [3]

Time Complexity: O(n²)

Asked In Companies:
Practice assignment
*/
import java.util.Scanner;

public class Q72_Array_Subarrays
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		int i, j, s, k;

		System.out.println("Enter the size of the array: ");
		s = sc.nextInt();
		int[] a = new int[s];

		System.out.println("Enter the array elements: ");
		for(i = 0; i < s; i++) a[i] = sc.nextInt();
		sc.close();

		System.out.println("Subarrays are - ");
		for(i = 0; i < s; i++)
		{
			for(j = i; j < s; j++)
			{
				for(k = i; k <= j; k++) System.out.print(a[k] + " ");

				System.out.println();
			}
		}
	}
}