/*
Q37. Count the number of Perfect numbers in an array.
Input: arr = [6, 28, 10, 12, 496]
Output: Count of Perfect numbers = 3
Explanation: A Perfect number is equal to the sum of its proper divisors (excluding itself). For each element, find the sum of divisors and compare with the number, then count.
*/
import java.util.Scanner;

public class Q37_Array_Perfect_Number_Count
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		int a[] = new int[n];
		int i, j, s;
		int p = 0;
		
		System.out.println("Enter the elements of the array: ");
		for(i = 0; i < n; i++)
		{
			a[i] = sc.nextInt();

			s = 0;
			for(j = 1; j < a[i]; j++)
			{
				if(a[i] % j == 0)
				{
					s = s + j;
				}
			}

			if(s == a[i])
			{
				p++;
			}
		}
		sc.close();
		System.out.println("Count of Perfect numbers = " + p);
	}
}

