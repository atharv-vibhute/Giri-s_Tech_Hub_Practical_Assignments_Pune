/*
Q9. Write a java program to copy one array to another array.
Input : Array1 = {5, 10, 15, 20}
Output : Array2 = {5, 10, 15, 20}
Explanation:
Copy each element of Array1 into Array2 using index-by-index assignment.
*/
import java.util.Scanner;

public class Q9_Array_Copy
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		int i;

		System.out.println("Enter the elements in the array: ");
		for(i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
			b[i] = a[i];
		}

		sc.close();
		System.out.print("\nArray2 = {");
		for(i = 0; i < a.length; i++)
		{
			if(i == a.length - 1)
			{
				System.out.print(b[i] + "}");
			}
			else
			{
				System.out.print(b[i] + ", ");
			}
		}
	}
}
