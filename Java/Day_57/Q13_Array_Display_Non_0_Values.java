/*
Q13. Write a java program to display only non-zero values from an array.
Input : Array = {1, 0, 5, 0, 7, 0, 9}
Output : Non-zero elements = {1, 5, 7, 9}
Explanation :
Traverse the array and print only elements that are not equal to zero.
*/
import java.util.Scanner;

public class Q13_Array_Display_Non_0_Values
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int s = sc.nextInt();
		int a[] = new int[s];
		int i;

		System.out.println("Enter the elements of the array: ");
		for(i = 0; i < s; i++)
		{
			a[i] = sc.nextInt();
		}

		sc.close();
		System.out.print("Non-zero elements = {");
		
		for(i = 0; i < s; i++)
		{
			if(a[i] == 0)
			{
				continue;
			}
			else if(i == (s - 1))
			{
				System.out.print(a[i] + "}");
			}
			else
			{
				System.out.print(a[i] + ", ");
			}
		}
	}
}