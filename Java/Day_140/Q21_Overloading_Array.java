/*
Question 21: Write a Java program to implement an Array Sum Calculator using Method Overloading.
Create a class ArrayOperation and overload method sum():
- sum(int arr[]) => Find sum of all array elements
- sum(int arr[], int size) => Find average of array elements
Input:
Enter array elements : 10 20 30 40 50

Output:
Sum : 150
Average : 30

Explanation:
sum(arr):
- Iterates through the array and adds all elements.
- 10 + 20 + 30 + 40 + 50 = 150. Prints Sum : 150.
sum(arr, size):
- Calculates average = total sum / number of elements.
- Average = 150 / 5 = 30. Prints Average : 30.
Both methods take the same array but differ by second parameter.
Java selects the correct overloaded method based on arguments passed.
This program teaches array traversal and aggregate operations with overloading.

Asked In Companies:
Practice assignment
*/
import java.util.Scanner;

public class Q21_Overloading_Array
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		int s, i;

		System.out.println("Enter the size of the array : ");
		s = sc.nextInt();
		int[] a = new int[s];

		System.out.println("Enter array elements: ");
		for(i = 0; i < s; i++) a[i] = sc.nextInt();
		sc.close();

		ArrayOperation(a);
		ArrayOperation(a, s);
	}

	public static void ArrayOperation(int[] a)
	{
		int i;
		int c = 0;

		for(i = 0; i < a.length; i++) c += a[i];
		System.out.println("Sum : " + c);
	}

	public static void ArrayOperation(int[] a, int s)
	{
		int i; 
		int c = 0;

		for(i = 0; i < a.length; i++) c += a[i];
		System.out.println("Average : " + (c / s));
	}
}