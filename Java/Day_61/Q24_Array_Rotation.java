/*
Q24. Write a program in java to rotate an array by N positions ?	
Expected Output:
	The given array is: 0  3  6  9  12  14  18  20  22  25  27
	From 4th position the values of the array are: 12 14 18 20 22 25 27 
	Before 4th position the values of the array are: 0  3  6  9 
	After rotating from 4th position the array is: 12 14 18 20 22 25 27 0 3  6 9
*/
import java.util.Scanner;

public class Q24_Array_Rotation
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int s = sc.nextInt();
		int a[] = new int[s];
		int i, j, n, t;

		System.out.println("Enter the elemets of the array: ");
		for(i = 0; i < s; i++)
		{
			a[i] = sc.nextInt();
		}

		System.out.println("Enter the number for rotate array by position: ");
		n = sc.nextInt();
		sc.close();

		for(i = 0; i < n; i++)
		{
			t = a[0];
			for(j = 0; j < (s - 1); j++)
			{
				a[j] = a[j + 1];
			}
			a[s - 1] = t;
		}

		System.out.println("Rotated array by " + n + "th position: ");
		for(i = 0; i < s; i++)
		{
			System.out.print(a[i] + " ");
		}
	}
}