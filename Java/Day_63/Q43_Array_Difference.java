/*
Q43. Write a program in java to find out the maximum difference between any two elements such that larger element appears after the smaller number.
Expected Output :
		The given array is : 7 9 5 6 13 2
		The elements which provide maximum difference is: 5, 13
		The Maximum difference between two elements in the array is: 8
*/
import java.util.Scanner;

public class Q43_Array_Difference
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int s = sc.nextInt();
		int a[] = new int[s];
		int n = Integer.MIN_VALUE;
		int i, m;
		int j = 0;

		System.out.println("Enter the array elements: ");
		for(i = 0; i < s; i++)
		{
			a[i] = sc.nextInt();
			
			if(a[i] > n)
			{
				j = i;
				n = a[i];
			}
		}
		sc.close();

		m = n;
		for(i = 0; i < j; i++)
		{
			if(m > a[i])
			{
				m = a[i];
			}
		}

		System.out.println("The elements which provide maximum difference is: " + m + ", " + n);
		System.out.println("The Maximum difference between two elements in the array is: " + (n - m));
	}
}