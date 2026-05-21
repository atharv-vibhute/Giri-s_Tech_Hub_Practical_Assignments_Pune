/*
Q20. Write a Java program to print all elements from an integer array that are greater than a given number.
Explanation
An integer array is given.
A number N is also given.
Traverse the array using a loop.
Compare each element with N.
If the element is greater than N, print it.
Input :- Array: 10 25 5 40 18
 Given Number: 20
Output :- Elements greater than 20 :
    25 40
*/
import java.util.Scanner;

public class Q20_Array_Greater_Than_Display
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int s = sc.nextInt();
		int a[] = new int[s];
		int i, n;

		System.out.println("Enter the element of the array = ");
		for(i = 0; i < s; i++)
		{
			a[i] = sc.nextInt();
		}

		System.out.println("Give the number for display array element greater than provided number: ");
		n = sc.nextInt();
		sc.close();
		System.out.println("Elements greater than " + n + " :");
		
		for(i = 0; i < s; i++)
		{
			if(a[i] > n)
			{
				System.out.print(a[i] + " ");
			}
		}
	}
}