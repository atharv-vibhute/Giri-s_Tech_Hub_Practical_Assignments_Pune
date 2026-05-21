/*
Q11. Write a java program to give an array, find the second largest element.
Input : Array = {12, 35, 1, 10, 34, 1}
Output : Second largest = 34
Explanation:
First largest is 35, second largest is the next maximum (34). We maintain two variables (largest, secondLargest).
*/
import java.util.Scanner;

public class Q11_Array_Second_Largest_Element
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array = ");
		int s = sc.nextInt();
		int a[] = new int[s];
		int m = Integer.MIN_VALUE;
		int n = m;
		int i;

		System.out.println("Enter the element in the array: ");
		for(i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
			
			if(a[i] > m)
			{
				m = a[i];
			}
		}
		sc.close();

		for(i = 0; i < a.length; i++)
		{
			if(a[i] > n && a[i] < m)
			{
				n = a[i];
			}
		}
		System.out.println("Second largest = " + n);
	}
}