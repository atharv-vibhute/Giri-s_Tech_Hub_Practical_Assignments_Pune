/*
Q15. Write a java program to find common elements between two arrays.
Input :
 Array1 = {1, 2, 3, 4, 5}
 Array2 = {3, 4, 5, 6, 7}
Output : Common elements = {3, 4, 5}
Explanation :
Compare each element of Array1 with all elements of Array2, if match found → it is a common element.
*/
import java.util.Scanner;

public class Q15_Array_Common_Elements
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the first array: ");
		int n = sc.nextInt();
		int a[] = new int[n];
		int i, j;

		System.out.println("Enter the element of the first array: ");
		for(i = 0; i < n; i++)
		{
			a[i] = sc.nextInt();
		}

		System.out.println("Enter the size of the second array: ");
		int m = sc.nextInt();
		int b[] = new int[m];

		System.out.println("Enter the element of the second array: ");
		for(j = 0; j < m; j++)
		{
			b[j] = sc.nextInt();
		}

		sc.close();
		System.out.print("\nCommon element = ");

		for(i = 0; i < n; i++)
		{
			for(j = 0; j < m; j++)
			{
				if(a[i] == b[j])
				{
					System.out.print(a[i] + " ");
				}
			}
		}

	}
}