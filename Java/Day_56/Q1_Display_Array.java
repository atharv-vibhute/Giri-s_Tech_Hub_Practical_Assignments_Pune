/*
Q1. Write a Java program to input an array & display it.
Input:
 Array Size = 5
 Array Elements = 10 20 30 40 50
Output:
 10 20 30 40 50
Explanation:
First, we take the size of the array from the user.
Then, elements are entered one by one into the array.
Finally, using a loop, we display all elements in the same order they were entered.
*/

import java.util.Scanner;

public class Q1_Display_Array
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of array: ");
		int n = sc.nextInt();
		int i;

		int a[] = new int[n];
		System.out.println("Enter the element in the array: ");

		for(i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}

		sc.close();		
		for(i = 0; i < a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
	}
}