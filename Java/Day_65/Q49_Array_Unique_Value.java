/*
Q49. Write a java program to find unique value in this given array.
	Input :- array elements: 1, 2, 3, 5, 1, 5, 20, 2, 12, 10 
	Output :-  All unique elements in the array are: 3, 20, 12, 10
*/
import java.util.Scanner;

public class Q49_Array_Unique_Value
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int s = sc.nextInt();
		int a[] = new int[s];
		boolean f;
		int i, j;
		
		System.out.println("Enter the array elements: ");
		for(i = 0; i < s; i++)
		{
			a[i] = sc.nextInt();
		}
		sc.close();

		System.out.print("\nAll unique elements in the array are: ");
		for(i = 0; i < s; i++)
		{
			f = true;
			for(j = 0; j < s; j++)
			{
				if(a[i] == a[j] && i != j)
				{
					f = false;
					break;
				}
			}

			if(f)
			{
				System.out.print(a[i] + " ");
			}
		}
	}
}