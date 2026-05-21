/*
Q10. Write a program in java to delete an element at desired position from an array.
	Test Data :
	Input the size of array : 5
	Input 5 elements in the array in ascending order :
	1   2    3    4    5	
	Input the position where to delete : 3
	Expected Output : The new list is : 1 2 3 5
*/
import java.util.Scanner;

public class Q10_Array_Delete_Element
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		int a[] = new int[n];
		int i, d;
		
		System.out.println("Enter the array element: ");
		for(i = 0; i < n; i++)
		{
			a[i] = sc.nextInt();
		}

		System.out.println("Enter the position where to delete: ");
		d = sc.nextInt();
		sc.close();

		if(d <= n && d >= 0)
		{
			n--;

			for(i = 0; i < n; i++)
			{
				if(i >= d)
				{
					a[i] = a[i + 1];
				}
			}

			System.out.print("\nThe new list is : ");
			for(i = 0; i < n; i++)
			{
				System.out.print(a[i] + " ");
			}
		}
		else
		{
			System.out.println("The Given position is not present in the array.");
		}
	}
}