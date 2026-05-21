/*
Q36. Count the number of prime numbers in an array.
Input: arr = [2, 5, 6, 9, 11]
Output: Count of prime numbers = 3
Explanation: Check each element if it is prime (only divisible by 1 and itself), and count such elements.
*/
import java.util.Scanner;

public class Q36_Array_Prime_Number_Count
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int s = sc.nextInt();
		int a[] = new int[s];
		int i, j, f;
		int p = 0;

		System.out.println("Enter the array elements: ");
		for(i = 0; i < s; i++)
		{
			a[i] = sc.nextInt();

			f = 0;
			for(j = 1; j <= a[i]; j++)
			{
				if(a[i] % j == 0)
				{
					f++;
				}
			}

			if(f == 2)
			{
				p++;
			}
		}
		sc.close();
		System.out.println("Count of prime numbers = " + p);
	}
}