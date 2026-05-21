/*
Q31. Replace First and Last Element with 0.
Input:[5, 3, 7, 2]
Output: [0, 3, 7, 0]
Explanation:
 The first element (5) and the last element (2) are replaced with 0. Middle elements remain the same.
*/
import java.util.Scanner;

public class Q31_Array_First_Last_0
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int s = sc.nextInt();
		int a[] = new int[s];
		int i;

		System.out.println("Enter the array elements: ");
		for(i = 0; i < s; i++)
		{
			a[i] = sc.nextInt();

			if(i == 0 || i == s - 1)
			{
				a[i] = 0;
			}
		}
		sc.close();

		System.out.print("\n[");
		for(i = 0; i < s; i++)
		{
			if(i == s - 1)
			{
				System.out.print(a[i] + "]");
			}
			else
			{
				System.out.print(a[i] + ", ");
			}
		}
	}
}
