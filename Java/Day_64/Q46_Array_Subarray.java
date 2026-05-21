/*
Q46.Write a program in java to find the maximum for each and every contigious subarray of size k from a given array.			
Expected Output:
		The given array is:
		1 3 6 21 4 9 12 3 16 10
		The length of each subarray is: 4
		The contagious subarray of length 4 and their maximum value are:
		1 3 6 21 ----> 21
		3 6 21 4 ----> 21
		6 21 4 9 ----> 21
		21 4 9 12 ----> 21
		4 9 12 3 ----> 12
		9 12 3 16 ----> 16
		12 3 16 10 ----> 16
*/
import java.util.Scanner;

public class Q46_Array_Subarray
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int s = sc.nextInt();
		int a[] = new int[s];
		int i, j, n, m;

		System.out.println("Enter the array elements: ");
		for(i = 0; i < s; i++)
		{
			a[i] = sc.nextInt();
		}

		System.out.println("Enter the length of subarray: ");
		n = sc.nextInt();
		sc.close();

		for(i = 0; i <= s - n; i++)
		{
			m = a[i];

			for(j = i; j < i + n; j++)
			{
				if(m < a[j])
				{
					m = a[j];
				}

				System.out.print(a[j] + " ");
			}

			System.out.print("-----> " + m);
			System.out.println();
		}
	}
}