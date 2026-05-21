/*
Q4. Write a Java program to display even & odd index values from an array.
Input:
 Array Size = 6
 Array Elements = 5 10 15 20 25 30
Output:
 Values at Even Index = 5 15 25
 Values at Odd Index = 10 20 30
Explanation:
Index starts from 0.
Even index positions are 0, 2, 4, ….
Odd index positions are 1, 3, 5, ….
We print the values according to their index category.
*/
import java.util.Scanner;

public class Q4_Array_Odd_Even_Index
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n = sc.nextInt();
		int i;
		int a[] = new int[n];

		System.out.println("Enter the elements in array: ");
		for(i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}

		sc.close();
		System.out.print("\nValues at Even Index = ");
		for(i = 0; i < a.length; i++)
		{
			if(i % 2 == 0)
			{
				System.out.print(a[i] + " ");
			}
		}

		System.out.print("\nValues at Odd Index = ");
		for(i = 0; i < a.length; i++)
		{
			if(i % 2 != 0)
			{
				System.out.print(a[i] + " ");
			}
		}
	}
}