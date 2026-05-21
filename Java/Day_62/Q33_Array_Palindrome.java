/*
Q33. Check whether the given array is a palindrome.
Input: {1, 2, 3, 2, 1}
Output: true
Explanation:
 A palindrome reads the same forward and backward.
 Forward: 1 2 3 2 1
 Backward: 1 2 3 2 1
 Since both are the same, the array is a palindrome.
*/
import java.util.Scanner;

public class Q33_Array_Palindrome
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int s = sc.nextInt();
		int a[] = new int[s];
		Boolean f = true;
		int i, j;

		System.out.println("Enter the array elements: ");
		for(i = 0; i < s; i++)
		{
			a[i] = sc.nextInt();
		}
		sc.close();

		for(i = 0, j = s - 1; i < s; i++, j--)
		{
			if(a[i] != a[j])
			{
				f = false;
				break;
			}
		}	
		System.out.println(f);
	}
}