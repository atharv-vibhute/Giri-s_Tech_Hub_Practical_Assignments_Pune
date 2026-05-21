/*
Q18. Write a Java program to check whether a given array is empty or not.
Explanation
Every array has a predefined property called length.
If array.length == 0, then the array is empty.
Otherwise, the array contains elements.
Input :- Array elements: { }
Output :- Array is empty
*/
import java.util.Scanner;

public class Q18_Array_Empty_Check
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array = ");
		int s = sc.nextInt();
		int a[] = new int[s];
		sc.close();
		System.out.println((s == 0)? "Array is empty" : "Array is not empty");
	}
}