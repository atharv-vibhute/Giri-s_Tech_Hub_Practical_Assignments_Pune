/*
Question 25: Write a Java program to implement Number Series Operation using Method Overloading.
Create a class SeriesOperation and overload method process():
- process(int arr[]) => Find sum of all elements
- process(int arr[], int size) => Find product of all elements
Input:
Enter array elements : 2 3 4 5

Output:
Sum : 14
Product : 120

Explanation:
process(arr):
- Adds all array elements: 2 + 3 + 4 + 5 = 14. Prints Sum : 14.
process(arr, size):
- Multiplies all array elements.
- Initialize product = 1 (not 0, as multiplying by 0 gives 0).
- 1 * 2 * 3 * 4 * 5 = 120. Prints Product : 120.
Both methods use a for loop to traverse the array.
Sum uses += and Product uses *= operator.
This program teaches two different aggregate operations using method overloading.

Asked In Companies:
Practice assignment
*/
import java.util.Scanner;

public class Q25_Overloading_Process
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		int s, i;
	
		System.out.println("Enter the size of the array: ");
		s = sc.nextInt();
		int[] a = new int[s];

		System.out.println("Enter array elements: ");
		for(i = 0; i < s; i++) a[i] = sc.nextInt();
		sc.close();

		process(a);
		process(a, s);
	}

	public static void process(int[] a)
	{
		int b = 0;
		int i;
		for(i = 0; i < a.length; i++) b += a[i];
		System.out.println("Sum : " + b);
	}

	public static void process(int[] a, int s)
	{
		int m = 1;
		int i;
		for(i = 0; i < s; i++) m *= a[i];
		System.out.println("Multiplication : " + m);
	}
}