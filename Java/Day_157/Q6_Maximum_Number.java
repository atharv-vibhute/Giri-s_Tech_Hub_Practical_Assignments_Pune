/*
Question 6: Write a Java program to store 5 numbers in an array using constructor and find maximum number.

Description: Create NumberArray class having an integer array. Initialize array using constructor. Find maximum number using logic.
INPUT:
Enter 5 numbers: 10 45 22 89 34

OUTPUT:
Maximum number is: 89

EXPLANATION:
Create NumberArray class with int[] array field. Use constructor public NumberArray(int[] nums) to initialize array. Create method findMax() to find maximum using loop. Compare each element and store maximum. Display maximum value.

Asked In Companies:
Practice Assignment
*/

import java.util.Scanner;

class Q6_Max
{
	int[] a;
	int i;
	int m = Integer.MIN_VALUE;

	Q6_Max(int[] a)
	{
		this.a = a;
	}

	public void display()
	{
		for(i = 0; i < a.length; i++) m = Math.max(m, a[i]);
		System.out.println("Maximum number is: " + m);
	}
}

public class Q6_Maximum_Number
{
	public static void main(String X[])
	{
		int i, s;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of Array: ");
		s = sc.nextInt();
		int[] a = new int[s];

		System.out.println("Enter the array elements: ");
		for(i = 0; i < s; i++) a[i] = sc.nextInt();
		sc.close();

		Q6_Max b = new Q6_Max(a);
		b.display();
	}
}