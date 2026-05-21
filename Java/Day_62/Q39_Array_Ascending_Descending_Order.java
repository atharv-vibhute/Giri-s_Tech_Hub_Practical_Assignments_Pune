/*
Q39. Write a Java program to sort a given array in ascending & descending order.
	 Input : 	Array = [12, 5, 9, 34, 1]
	Output : 	Ascending Order: [1, 5, 9, 12, 34]
Descending Order: [34, 12, 9, 5, 1]
Explanation:
Sorting means arranging elements in a particular order.
In ascending order, numbers are arranged from smallest to largest.
For example: 1 < 5 < 9 < 12 < 34.
In descending order, numbers are arranged from largest to smallest.
For example: 34 > 12 > 9 > 5 > 1.
The program should first sort the array in ascending order, then print the reverse of that order for descending
*/
import java.util.Scanner;

public class Q39_Array_Ascending_Descending_Order
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int s = sc.nextInt();
		int a[] = new int[s];
		int i, j, t;

		System.out.println("Enter the array elements: ");
		for(i = 0; i < s; i++)
		{
			a[i] = sc.nextInt();
		}
		sc.close();

		for(i = 0; i < s; i++)
		{
			for(j = i; j < s; j++)
			{
				if(a[j] < a[i])
				{
					t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}

		System.out.print("\nAsceding Order: [");
		for(i = 0; i < s; i++)
		{
			if(i == s- 1)
			{
				System.out.print(a[i] + "]");
			}
			else
			{
				System.out.print(a[i] + ", ");
			}
		}

		for(i = 0; i < s; i++)
		{
			for(j = i; j < s; j++)
			{
				if(a[j] > a[i])
				{
					t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		} 

		System.out.print("\nDescending Order: [");
		for(i = 0; i < s; i++)
		{
			if(i == s - 1)
			{
				System.out.print(a[i] + "]");
			}
			else
			{
				System.out.print(a[i] + ", ");
			}
		}
	}
}