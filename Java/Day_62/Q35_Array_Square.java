/*
Q35. Create a new array where each element is the square of the original.
Input: arr = [2, 4, 6, 8]
Output: newArr = [4, 16, 36, 64]
Explanation: For each index, calculate arr[i] * arr[i] and store it in the new array.
*/
import java.util.Scanner;

public class Q35_Array_Square
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int s = sc.nextInt();
		int a[] = new int[s];
		int b[] = new int[s];
		int i;

		System.out.println("Enter the array elements: ");
		for(i= 0; i< s; i++)
		{
			a[i] = sc.nextInt();
			b[i] = a[i] * a[i];
		}
		sc.close();

		System.out.print("\nnewArr = [");
		for(i = 0; i < s; i++)
		{
			if(i == s - 1)
			{
				System.out.print(b[i] + "]");
			}
			else
			{
				System.out.print(b[i] + ", ");
			}
		}
	}
}