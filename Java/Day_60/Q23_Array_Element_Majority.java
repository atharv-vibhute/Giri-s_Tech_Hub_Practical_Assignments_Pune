/*
Q23. Write a Java program to find the Majority Element of an array.
A majority element in an array of size n is an element that appears more than n/2 times. There can be at most one majority element in the array.
Example :- The given array is: 4 8 4 6 7 4 4 8
       There are no Majority Elements in the given array
Explanation
Traverse the array using two loops.
For each element, count how many times it appears.
If the count of any element is greater than n/2, that element is the majority element.
If no such element is found after checking all elements, print that there is no majority element.
*/
import java.util.Scanner;

public class Q23_Array_Element_Majority
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int s = sc.nextInt();
		int a[] = new int[s];
		int m = Integer.MAX_VALUE;
		int n = Integer.MIN_VALUE;
		int i, j, c;
		Boolean f = false;

		System.out.println("Enter the element of the array: ");
		for(i = 0; i < s; i++)
		{
			a[i] = sc.nextInt();

			if(a[i] < m)
			{
				m = a[i];
			}

			if(a[i] > n)
			{
				n = a[i];
			}
		}
		sc.close();

		for(i = m; i <= n; i++)
		{
			c = 0;

			for(j = 0; j < s; j++)
			{
				if(i == a[j])
				{
					c++;
				}
			}

			if(c > (s / 2))
			{
				f = true;
				break;
			}
		}

		if(f)
		{
			System.out.println("Majority Element = " + a[i]);
		}
		else
		{
			System.out.println("There are no Majority Elements in the given array");
		}
	}
}