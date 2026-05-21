/*
Q5. Write a Java program to count even & odd values from an array.
Input:
 Array Size = 7
 Array Elements = 12 17 24 39 40 55 70
Output:
 Count of Even Values = 4
 Count of Odd Values = 3
Explanation:
Initialize counters: evenCount = 0, oddCount = 0.
For each element in the array:
	If divisible by 2 → increase evenCount.
	Otherwise → increase oddCount.
Final counts are displayed.
*/
import java.util.Scanner;

public class Q5_Array_Odd_Even_Count
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		int a[] = new int[n];
		int i;
		int e = 0;
		int o = 0;

		System.out.println("Enter the elements in the array: ");
		for(i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();

			if(a[i] % 2 == 0)
			{
		 		e++;
			}
			else
			{
				o++;
			}
		}

		sc.close();
		System.out.println("Count of Even Values = " + e);
		System.out.println("Count of Odd Values = " + o);
	}
}
