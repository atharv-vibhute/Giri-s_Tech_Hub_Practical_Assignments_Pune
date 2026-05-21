/*
Q38. Write a program in java to find the smallest missing element from a sorted array?
Expected Output :
		The given array is : 0 1 3 4 5 6 7 9
		The missing smallest element is: 2
*/
import java.util.Scanner;

public class Q38_Array_Smallest_Missing_Element
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int s = sc.nextInt();
		int a[] = new int[s];
		int m = Integer.MAX_VALUE;
		int n = Integer.MIN_VALUE;
		Boolean f = true;
		int j = 0;
		int i;

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
			f = true;
			for(j = 0; j < s; j++)
			{
				if(a[j] == i)
				{
					f = false;
					break;
				}
	
			}

			if(f)
			{
				break;
			}
		}

		if(f)
		{
			System.out.println("The missing smallest element is: " + i);
		}
		else
		{
			System.out.println("There is no missing smallest element");
		}
	}
}