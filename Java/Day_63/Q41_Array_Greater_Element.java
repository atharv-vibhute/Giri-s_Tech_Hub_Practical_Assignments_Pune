/*
Q41. Write a program in java to to print next greater elements in a given unsorted array. Elements for which no greater element exist, consider next greater element as -1.
Expected Output :
		The given array is : 5 3 10 9 6 13
		Next Bigger Elements are:
		Next bigger element of 5 in the array is: 10
		Next bigger element of 3 in the array is: 10
		Next bigger element of 10 in the array is: 13
		Next bigger element of 9 in the array is: 13
		Next bigger element of 6 in the array is: 13
		Next bigger element of 13 in the array is: -1
		Next Bigger Elements Array:
		10 10 13 13 13 -1
*/
import java.util.Scanner;

public class Q41_Array_Greater_Element
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int s = sc.nextInt();
		int a[] = new int[s];
		Boolean f = true;
		int i, j;

		System.out.println("Enter the array elements: ");
		for(i = 0; i < s; i++)
		{
			a[i] = sc.nextInt();
		}
		sc.close();

		System.out.print("\nNext Bigger Elements Array: ");
		for(i = 0; i < s; i++)
		{
			f = true;
			for(j = i + 1; j < s; j++)
			{
				if(a[i] < a[j])
				{
					System.out.println(a[i] + " " +a[j] + " ");
					f = false;
					break;
				}
			}
		
			if(f)
			{
				System.out.print(a[i] + " -1");
			}
		}
	}
}