/*
Q14.  Write a java program to remove duplicated values from arrays.
Input : Array = {10, 20, 20, 30, 40, 40, 50}
Output : Unique elements = {10, 20, 30, 40, 50}
Explanation:
Traverse the array, check if element already exists before adding to result, thus avoiding duplicates.
*/
import java.util.Scanner;

public class Q14_Array_Remove_Duplicated_Values_Help_Dnyaneshwar_Thombare_Sir
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int s = sc.nextInt();
		int a[] = new int[s];
		int i, j, k;

		System.out.println("Enter the element of the array: ");
		for(i = 0; i < s; i++)
		{
			a[i] = sc.nextInt();
		}
		sc.close();

		for(i = 0; i < s; i++)
		{
			for(j = (i + 1); j < s; j++)
			{
				if(a[i] == a[j])
				{
					for(k = j; k < (s - 1); k++)
					{
						a[k] = a[k + 1];
					}
					s--;
					j--;
				}
			}

			
		}

		System.out.println("Unique element: ");
		for(i = 0; i < s; i++)
		{
			System.out.print(a[i] + " ");
		}
	}
}