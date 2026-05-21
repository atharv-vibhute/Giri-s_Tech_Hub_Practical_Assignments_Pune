/*
Q26. Write a java program to count all pairs of elements in an array whose sum is equal to a given number.
Input :- arr = [1, 5, 7, -1, 5]        sum = 6
Output :- 3
Explanation:
Pairs whose sum = 6 are:
(1, 5) → first occurrence
(7, -1)
(1, 5) → second occurrence (from the second 5)
Total pairs = 3
*/
import java.util.Scanner;

public class Q26_Array_Sum_Pairs
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int s = sc.nextInt();
		int a[] = new int[s];
		int i, j, n;
		int p = 0;

		System.out.println("Enter the array elements: ");
		for(i = 0; i < s; i++)
		{
			a[i] = sc.nextInt();
		}

		System.out.println("Enter the sum you wanted which gives number of pairs: ");
		n = sc.nextInt();
		sc.close();

		for(i = 0; i < (s - 1); i++)
		{
			for(j = i + 1; j < s; j++)
			{
				if(n == a[i] + a[j])
				{
					p++;
				}
			}
		}

		System.out.println(p);
	}
}