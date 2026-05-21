/*
Q47. Write a java program to merge of two given array.
	Input :- First Array :- 1 2 3 4 5
             	 Second Array :-  6 7 8 9 10 
	Output :- 1 2 3 4 5 6 7 8 9 10
*/
import java.util.Scanner;

public class Q47_Array_Merge
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		int i, j, n, m;

		System.out.println("Enter the size of the first array: ");
		n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the first array elements: ");
		for(i = 0; i < n; i++)
		{
			a[i] = sc.nextInt();
		}

		System.out.println("Enter the size of the second array: ");
		m = sc.nextInt();
		int b[] = new int[m];
		System.out.println("Enter the second array elements: ");
		for(i = 0; i < m; i++)
		{
			b[i] = sc.nextInt();
		} 
		sc.close();

		int c[] = new int[n + m];
		for(i = 0, j = n; i < n; i++, j++)
		{
			c[i] = a[i];
			c[j] = b[i];
		}

		for(i = 0; i < n + m; i++)
		{
			System.out.print(c[i] + " ");
		}
	}
}