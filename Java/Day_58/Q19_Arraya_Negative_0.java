/*
Q19. Given an integer array, replace all the negative numbers in the array with 0 and print the updated array.
Explanation
Traverse the array from the first element to the last.
Check each element:
If the element is negative, replace it with 0.
If the element is zero or positive, keep it as it is.
After completing the traversal, print the modified array.
Input :- Array = [5, -3, 7, -1, 0, -6, 4]
Output :- Updated Array = [5, 0, 7, 0, 0, 0, 4]
*/
import java.util.Scanner;

public class Q19_Arraya_Negative_0
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array = ");
		int s = sc.nextInt();
		int a[] = new int[s];
		int i;

		System.out.println("Enter the element in the array = ");
		for(i = 0; i < s; i++)
		{
			a[i] = sc.nextInt();
		}

		sc.close();
		System.out.print("\nUpdated Array = [");

		for(i = 0; i < s; i++)
		{
			if(a[i] < 0)
			{
				a[i] = 0;
			}

			if(i == (s - 1))
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