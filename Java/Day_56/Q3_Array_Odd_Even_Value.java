/*
Q3. Write a Java program to display even & odd values from an array.
Input:
 Array Size = 6
 Array Elements = 11 20 33 42 55 60
Output:
 Even Values = 20 42 60
 Odd Values = 11 33 55
Explanation:
Traverse the array element by element.
If an element is divisible by 2, it is even. Otherwise, it is odd.
Separate lists are displayed for even and odd values.
*/
import java.util.Scanner;

public class Q3_Array_Odd_Even_Value
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array =");
		int n = sc.nextInt();
		int a[] = new int[n];
		int i;

		System.out.println("Enter the element in the array: ");
		for(i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		sc.close();

		System.out.print("\nEven Values = ");
		for(i = 0; i < a.length; i++)
		{
			if(a[i] % 2 == 0)
			{
				System.out.print(a[i] + " ");
			}
		}

		System.out.print("\nOdd Values = ");
		for(i = 0; i < a.length; i++)
		{
			if(a[i] % 2 != 0)
			{
				System.out.print(a[i] + " ");
			}
		}
	}
}