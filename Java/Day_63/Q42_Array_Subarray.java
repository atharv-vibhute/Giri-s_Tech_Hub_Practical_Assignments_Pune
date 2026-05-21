/*
Q42. Write a program in java to find a subarray with given sum from the given array?
Expected Output :
		The given array is : 3 4 -7 1 3 3 1 -4
		[0..1] -- { 3 4 }
		[0..5] -- { 3 4 -7 1 3 3 }
		[3..5] -- { 1 3 3 }
		[4..6] -- { 3 3 1 }
*/
import java.util.Scanner;

public class Q42_Array_Subarray
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int s = sc.nextInt();
		int a[] = new int[s];
		int i, m, n;

		System.out.println("Enter the array elements: ");
		for(i = 0; i < s; i++)
		{
			a[i] = sc.nextInt();
		}
		
		System.out.println("Enter the starting subarray index: ");
		m = sc.nextInt();
		System.out.println("Enter the ending subarray index: ");
		n = sc.nextInt();
		sc.close();

		if(m >= 0 && n >= 0 && m < s && n < s)
		{
			System.out.print("\n[" + m + ".." + n + "] -- { ");
			for(i = m; i <= n; i++)
			{
				System.out.print(a[i] + " ");
			}
			System.out.print("}");
		}
		else
		{
			System.out.println("Invalid Indies");
		}
	}
}