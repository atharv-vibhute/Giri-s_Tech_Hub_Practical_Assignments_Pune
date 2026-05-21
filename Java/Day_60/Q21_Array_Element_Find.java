/*
Q21. Given an integer array and a specific element, write a Java program to find the index position of that element in the array. If the element is not found, print -1.
Explanation
Traverse the array from index 0 to length - 1
Compare each element with the target element
If a match is found, return its index
If the loop ends and no match is found, return -1
Input :- Array: {10, 20, 30, 40, 50}
Element to find: 30
Output :- Element found at index: 2
*/
import java.util.Scanner;

public class Q21_Array_Element_Find
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int s = sc.nextInt();
		int a[] = new int[s];
		int i, n;
		Boolean f = false;

		System.out.println("Enter the element of the array: ");
		for(i = 0; i < s; i++)
		{
			a[i] = sc.nextInt();
		}

		System.out.println("Enter the number which is find in the array: ");
		n = sc.nextInt();
		sc.close();

		for(i = 0; i < s; i++)
		{
			if(n == a[i])
			{
				f = true;
				break;
			}
		}

		if(f)
		{
			System.out.println("Element found at index: " + i);
		}
		else
		{
			System.out.println("-1");
		}
	}
}
