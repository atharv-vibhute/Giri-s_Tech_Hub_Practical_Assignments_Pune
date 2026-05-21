/*
Q22. Write a Java program to check whether two integer arrays are equal.
 Two arrays are considered equal if:
Both arrays have the same length
Corresponding elements at each index are exactly the same
Do not use inbuilt methods like Arrays.equals().
Input :- Array1 = {10, 20, 30, 40}
            Array2 = {10, 20, 30, 40}
Output :- Arrays are equal.
*/
import java.util.Scanner;

public class Q22_Arrays_Check_Equal
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		int n, m, i, j;
		Boolean f = true;

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

		if(n == m)
		{
			for(i = 0; i < n; i++)
			{
				if(a[i] != b[i] )
				{
					f = false;
					break;
				}
			}
		}
		else
		{
			f = false;
		}


		if(f)
		{
			System.out.println("Arrays are equal");
		}
		else
		{
			System.out.println("Arrays are not equal");
		}
	}
}