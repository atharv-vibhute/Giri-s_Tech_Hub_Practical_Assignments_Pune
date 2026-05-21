/*
Q51. Write a java program to display top three value from array.

	Sample Input: [78, 90, 90, 86, 85, 92, 70, 92]
	Expected Output: 92, 90, 86
*/
import java.util.Scanner;

public class Q51_Array_Top_3_Value
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int s = sc.nextInt();
		int a[] = new int[s];
		int i;
		int x = Integer.MIN_VALUE;
		int y = Integer.MIN_VALUE;
		int z = Integer.MIN_VALUE;

		System.out.println("Enter the array elements: ");
		for(i = 0; i < s; i++)
		{
			a[i] = sc.nextInt();

			if(x < a[i])
			{
				x = a[i];
			}
		}
		sc.close();

		for(i = 0; i < s; i++)
		{
			if(y < a[i] && a[i] != x)
			{
				y = a[i];
			}
		}

		for(i = 0; i < s; i++)
		{
			if(z < a[i] && a[i] != y)
			{
				z = a[i];
			}
		}
		System.out.println(x + " " + y + " " + z);
	}
}