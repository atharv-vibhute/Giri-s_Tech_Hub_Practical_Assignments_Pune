/*
Q30. Replace All Elements Divisible by 3 with -1.
Input: [3, 6, 7, 9, 10]
Output: [-1, -1, 7, -1, 10]
Explanation:
 Elements divisible by 3 are 3, 6, 9. These are replaced with -1. Other elements remain unchanged.
*/
import java.util.Scanner;

public class Q30_Array_Divisible_3_1
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

			if(a[i] % 3 == 0)
			{
				a[i] = -1;
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