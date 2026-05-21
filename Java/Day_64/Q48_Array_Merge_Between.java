/*
Q48. Write a java program to merge of two given array.
Input :- First Array :- 1 2 3 4 5
             	 Second Array :-  6 7 8 9 10 
	Output :- 1 10 2 9 3 8 4 7 5 6
*/
import java.util.Scanner;

public class Q48_Array_Merge_Between
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		int n, m, i, j, k;

		System.out.println("Enter the size of first array: ");
		n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the first array elements: ");
		for(i = 0; i < n; i++)
		{
			a[i] = sc.nextInt();
		}
	
		System.out.println("Enter the size of second array: ");
		m = sc.nextInt();
		int b[] = new int[m];
		System.out.println("Enter the second array elements: ");
		for(i = 0; i < m; i++)
		{
			b[i] = sc.nextInt();
		}
		sc.close();

		int c[] = new int[n + m];
		for(k = 0, j = 1, i = 0; i < n; k = k + 2, j = j + 2, i++)
		{
			c[k] = a[i];
			c[j] = b[m - i - 1];
		}

		for(i = 0; i < n + m; i++)
		{
			System.out.print(c[i] + " ");
		}
	}
}