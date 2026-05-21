/*
Q34. Return the first element that repeats in the array.
Input: {10, 5, 3, 4, 3, 5, 6}
Output: First repeating element is 5
Explanation:
Traverse from left:
10 → first time.
5 → first time.
3 → first time.
4 → first time.
3 → already seen earlier → repeating, but not the first repeating (we must check carefully).
5 → this was the earliest element that repeats.
Therefore, the first repeating element is 5.
*/
import java.util.Scanner;

public class Q34_Array_First_Repeating_Element
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int s = sc.nextInt();
		int a[] = new int[s];
		Boolean f = false;
		int i, j;

		System.out.println("Enter the element in the array: ");
		for(i = 0; i < s; i++)
		{
			a[i] = sc.nextInt();
		}
		sc.close();

		for(i = 0; i < s; i++)
		{
			for(j = 0; j < s; j++)
			{
				if(a[i] == a[j] && i != j)
				{
					f = true;
					break;
				}
			}
			
			if(f)
			{
				break;
			}
		}

		if(f)
		{
			System.out.println("First repeating element is " + a[i]);
		}
		else
		{
			System.out.println("There is no repeating element");
		}
	}
}