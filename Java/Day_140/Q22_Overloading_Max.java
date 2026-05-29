/*
Question 22: Write a Java program to implement an Array Maximum Finder using Method Overloading.
Create a class ArrayMax and overload method max():
- max(int arr[]) => Find the largest element
- max(int arr[], int size) => Find the smallest element
Input:
Enter array elements : 12 7 45 20 33

Output:
Largest Number : 45
Smallest Number : 7

Explanation:
max(arr):
- Starts with arr[0] = 12 as initial maximum.
- Compares each element: 12, 7, 45, 20, 33.
- 45 is the largest. Prints Largest Number : 45.
max(arr, size):
- Starts with arr[0] = 12 as initial minimum.
- Compares each element: 12, 7, 45, 20, 33.
- 7 is the smallest. Prints Smallest Number : 7.
Despite similar names, each overload performs a distinct operation.
This demonstrates max/min search in arrays using method overloading.

Asked In Companies:
Practice assignment
*/
import java.util.Scanner;

public class Q22_Overloading_Max
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		int s, i;

		System.out.println("Enter size of array: ");
		s = sc.nextInt();
		int[] a = new int[s];
	
		System.out.println("Enter array elements: ");
		for(i = 0; i < s; i++) a[i] = sc.nextInt();
		sc.close();

		max(a);
		max(a, s);		
	}

	public static void max(int[] a)
	{
		int n = a[0];
		int i;
		for(i = 0; i < a.length; i++) if(a[i] > n) n = a[i];
		System.out.println("Largest Number : " + n);
	}

	public static void max(int[] a, int s)
	{
		int m = a[0];
		int i;
		for(i = 0; i < s; i++) if(a[i] < m) m = a[i];
		System.out.println("Smallest Number : " + m);
	}
}

