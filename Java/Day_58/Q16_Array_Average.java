/*
Q16.Write a Java program to calculate the average of all elements present in an integer array.
Explanation
The average of array elements is calculated by:
 Average=Sum of all elementsNumber of elements\text{Average} = \frac{\text{Sum of all elements}}{\text{Number of elements}}Average=Number of elementsSum of all elements​
First, iterate through the array and add all elements to a variable sum.
Then divide sum by the total number of elements (array.length) to get the average.
Input Array:
 [10, 20, 30, 40, 50]
Output:
 Average of array elements = 30
*/
import java.util.Scanner;

public class Q16_Array_Average
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array = ");
		int n = sc.nextInt();
		int b[] = new int[n];
		int i, a;
		int s = 0;

		System.out.println("Enter the elements of the array = ");
		for(i = 0; i < n; i++)
		{
			b[i] = sc.nextInt();
			s = s + b[i];
		}
		sc.close();
		a = s / n;
		System.out.println("Average of array elements = " + a);
	}
}