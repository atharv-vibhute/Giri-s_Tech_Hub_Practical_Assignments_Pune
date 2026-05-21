/*
Q6. Write a java program to search an element in an array , its element found or not.
Input:
 Array = {10, 20, 30, 40, 50}
 Element to search = 30
Output : Element 30 found at index 2
Explanation :
We traverse the array and compare each element with the search key. If it matches, print "found" with index; otherwise print "not found".
*/
import java.util.Scanner;

public class Q6_Array_Search_Elements
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int s = sc.nextInt();
		int i, n;
		int a[] = new int[s];
		Boolean f = false;
		
		System.out.println("Enter the elements in the array: ");
		for(i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}

		System.out.println("Enter the element to search in the array: ");
		n = sc.nextInt();
		sc.close();

		for(i = 0; i < a.length; i++)
		{
			if(a[i] == n)
			{
				f = true;
				break;
			}
		}

		if(f)
		{
			System.out.println("Element " + n + " found at index " + i);
		}
		else
		{
			System.out.println("Element " + n + " not found");
		}
	}
}