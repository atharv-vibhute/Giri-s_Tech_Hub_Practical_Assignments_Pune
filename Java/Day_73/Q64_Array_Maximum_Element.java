/*
Question 64: Find Maximum in Array
Description:
Find the largest element in an array.
Input:
[3,8,2,9,1]

Output:
Max = 9

Explanation:
Each element compared once.

Time Complexity: O(n)

Asked In Companies:
Practice assignment
*/
import java.util.Scanner;

public class Q64_Array_Maximum_Element
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int s = sc.nextInt();
		int a[] = new int[s];
		int n = Integer.MIN_VALUE;
		int i;

		System.out.println("Enter the array elements: ");
		for(i = 0; i < s; i++)
		{
			a[i] = sc.nextInt();

			if(a[i] > n)
			{
				n = a[i];
			}
		}
		sc.close();
		System.out.println("Max = " + n);
	}
}