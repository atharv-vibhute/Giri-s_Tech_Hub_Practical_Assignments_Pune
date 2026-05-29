/*
Question 24: Write a Java program to implement Array Comparison using Method Overloading.
Create a class ArrayCompare and overload method compare():
- compare(int arr1[], int arr2[]) => Find sum of both arrays
- compare(int arr1[], int arr2[], int size) => Find difference of sums
Input:
Array1 : 10 20 30
Array2 : 5 15 25

Output:
Sum of Array1 : 60
Sum of Array2 : 45
Difference : 15

Explanation:
compare(arr1, arr2):
- Calculates sum of each array separately.
- Sum of Array1 = 10 + 20 + 30 = 60.
- Sum of Array2 = 5 + 15 + 25 = 45.
- Prints both sums.
compare(arr1, arr2, size):
- Calculates difference of sums: 60 - 45 = 15.
- The extra parameter 'size' differentiates this overload.
This program demonstrates working with multiple arrays and method overloading.

Asked In Companies:
Practice assignment
*/
import java.util.Scanner;

public class Q24_Overloading_Compare
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		int s, i;

		System.out.println("Enter size of the array: ");
		s = sc.nextInt();
		int[] a = new int[s];
		int[] b = new int[s];

		System.out.println("Enter the first array element: ");
		for(i = 0; i < s; i++) a[i] = sc.nextInt();
		System.out.println("Enter the second array element: ");
		for(i = 0; i < s; i++)	b[i] = sc.nextInt();
		sc.close();

		compare(a, b);
		compare(a, b, s);
	}

	public static void compare(int[] a, int[] b)
	{
		int x = 0;
		int y = 0;
		int i;

		for(i = 0; i < a.length; i++)
		{
			x += a[i];
			y += b[i];
		}

		System.out.println("Sum of Array1 : " + x);
		System.out.println("Sum of Array2 : " + y);
	}

	public static void compare(int[] a, int[] b, int s)
	{
		int x = 0;
		int y = 0;
		int i, z;

		for(i = 0; i < s; i++)
		{
			x += a[i];
			y += b[i];
		}

		z = (x > y)? x - y : y - x;
		System.out.println("Difference : " + z);
	}
}
