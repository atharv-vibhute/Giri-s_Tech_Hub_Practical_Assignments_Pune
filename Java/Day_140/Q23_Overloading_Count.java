/*
Question 23: Write a Java program to implement an Array Number Counter using Method Overloading.
Create a class ArrayCount and overload method count():
- count(int arr[]) => Count even numbers in array
- count(int arr[], int size) => Count odd numbers in array
Input:
Enter array elements : 5 8 12 7 9 4

Output:
Even Numbers : 3
Odd Numbers : 3

Explanation:
count(arr):
- Iterates array. For each element: if (num % 2 == 0) => increment even counter.
- Even numbers: 8, 12, 4 => count = 3.
count(arr, size):
- For each element: if (num % 2 != 0) => increment odd counter.
- Odd numbers: 5, 7, 9 => count = 3.
Both methods loop through the same array but apply different conditions.
This program teaches filtering/counting in arrays using method overloading.

Asked In Companies:
Practice assignment
*/
import java.util.Scanner;

public class Q23_Overloading_Count
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		int s, i;

		System.out.println("Enter size of the array: ");
		s = sc.nextInt();
		int[] a = new int[s];

		System.out.println("Enter the array elements: ");
		for(i = 0; i < s; i++) a[i] = sc.nextInt();
		sc.close();

		count(a);
		count(a, s);
	}

	public static void count(int[] a)
	{
		int c = 0;
		int i;
		for(i = 0; i < a.length; i++) if(a[i] % 2 == 0) c++;
		System.out.println("Even Numbers : " + c);
	}

	public static void count(int[] a, int s)
	{
		int c = 0;
		int i;
		for(i = 0; i < s; i++) if(a[i] % 2 != 0) c++;
		System.out.println("Odd Numbers : " + c);
	}
}