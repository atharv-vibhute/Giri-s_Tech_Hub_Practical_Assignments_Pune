/*
Q32. Replace all elements in the array that are multiples of 5 with the number 5 itself.
Input: [10, 12, 15, 17, 20]
Output: [5, 12, 5, 17, 5]
Explanation:
10 is divisible by 5 → replaced with 5.
12 is not divisible by 5 → unchanged.
15 is divisible by 5 → replaced with 5.
17 is not divisible by 5 → unchanged.
20 is divisible by 5 → replaced with 5.
*/
import java.util.Scanner;

public class Q32_Array_Multiple_5
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int s = sc.nextInt();
		int a[] = new int[s];
		int i;

		System.out.println("Enter the element of the array: ");
		for(i = 0; i < s; i++)
		{
			a[i] = sc.nextInt();

			if(a[i] % 5 == 0)
			{
				a[i] = 5;
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