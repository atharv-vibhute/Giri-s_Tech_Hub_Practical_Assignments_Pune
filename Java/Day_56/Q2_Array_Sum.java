/*
Q2. Write a Java program to calculate the sum of all elements in an array.
Input:
 Array Size = 5
 Array Elements = 2 4 6 8 10
Output:
 Sum of array elements = 30
Explanation:
Initialize a variable sum = 0.
Traverse the array and keep adding each element to sum.
After the loop ends, sum will hold the total of all array elements.
*/
import java.util.Scanner;

public class Q2_Array_Sum
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		int i;
		int s = 0;

		int a[] = new int[n];
		System.out.println("Enter the element of the array: ");

		for(i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
			s = s + a[i];
		}

		sc.close();
		System.out.println("Sum of array elements = " + s);
	}
}