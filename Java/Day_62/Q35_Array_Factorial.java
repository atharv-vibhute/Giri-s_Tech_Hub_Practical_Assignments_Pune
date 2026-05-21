/*
Q35. Replace each element with its factorial.
Input: arr = [3, 4, 5]
Output: arr = [6, 24, 120]
Explanation: For each element, calculate factorial using repeated multiplication, and update the array element with this value
*/
import java.util.Scanner;

public class Q35_Array_Factorial
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int s = sc.nextInt();
		int a[] = new int[s];
		int i, j, f;

		System.out.println("Enter the size of the array: ");
		for(i = 0; i < s; i++)
		{
			a[i] = sc.nextInt();

			f = 1;
			for(j = 1; j <= a[i]; j++)
			{
				f = f * j;
			}
			a[i] = f;
		}
		sc.close();

		System.out.print("\narr = [");
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

