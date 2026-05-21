/*
Q44.Write a program in java to find two elements whose sum is closest to zero.			 
Expected Output :
		The given array is : 38 44 63 -51 -35 19 84 -69 4 -46
		The Pair of elements whose sum is minimum are: [44, -46]
*/
import java.util.Scanner;

public class Q44_Array_Sum_Cloest_0
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int s = sc.nextInt();
		int a[] = new int[s];
		int i, j;
		int d = Integer.MAX_VALUE;
		int x = 0; 
		int y = 0;
		int n = Integer.MAX_VALUE;

		System.out.println("Enter the array elements: ");
		for(i = 0; i < s; i++)
		{
			a[i] = sc.nextInt();
		}
		sc.close();

		for(i = 0; i < s - 1; i++)
		{
			for(j = i + 1; j < s; j++)
			{
				if(a[i] > 0 && a[j] < 0)
				{
					d = a[i] + a[j];
				}
				else if(a[i] < 0 && a[j] > 0)
				{
					d = a[j] + a[i];
				}

				if(d < 0)
				{
					d = -d;
				}

				if(d < n)
				{
					n = d;
					x = a[i];
					y = a[j];
				}
			}
		}

		System.out.println("The pair of elements whose sum is minimum are: [" + x + ", " + y + "]");

	}
}