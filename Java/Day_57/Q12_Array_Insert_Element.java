/*
Q12. Write a program in java to insert an element at desired position from an array.
	Test Data :
	Input the size of array : 6
	Input 5 elements in the array in ascending order :
	1   2    3    4    5
	Input the position where to insert : 2
	Value :      200
	Expected Output : The new list is : 1 2 200 3 4 5
*/
import java.util.Scanner;

public class Q12_Array_Insert_Element
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int s = sc.nextInt();
		int a[] = new int[s];
		int i, n, v;

		System.out.println("Enter the element of the array: ");
		for(i = 0; i < (s - 1); i++)
		{
			a[i] = sc.nextInt();
		}

		System.out.println("Enter the position where to insert: ");
		n = sc.nextInt();

		if(n >= 0 && n < s)
		{
			System.out.println("Enter the value: ");
			v = sc.nextInt();

			for(i = (s - 1); i > n; i--)
			{
				a[i] = a[i - 1];
			}
			a[n] = v;

			System.out.print("\nThe new list is : ");
			for(i = 0; i < s; i++)
			{
				System.out.print(a[i] + " ");
			} 
		}
		else
		{
			System.out.println("Given position is not in the range of 0 to " + (s - 1) + ". Please try again.");
		}
		sc.close();
	}
}
