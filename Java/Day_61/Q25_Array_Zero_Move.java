/*
Q25. Move all zeros in an array to the end while maintaining the relative order of non-zero elements.
	Input :- arr = [0, 1, 0, 3, 12]
	Output :- arr = [1, 3, 12, 0, 0]
Explanation:
All non-zero elements [1, 3, 12] retain their original order.
All zeros are moved to the end of the array.
*/
import java.util.Scanner;

public class Q25_Array_Zero_Move
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int s = sc.nextInt();
		int a[] = new int[s];
		int i, j;
		int t = 0;

		System.out.println("Enter the array elements: ");
		for(i = 0; i < s; i++)
		{
			a[i] = sc.nextInt();
		}
		sc.close();

		for(i = 0; i < s; i++)
		{
			if(a[i] == 0)
			{
				for(j = i; j < (s - 1); j++)
				{
					a[j] = a[j + 1]; 
				}
				
				i--;
				t++;
			}
		}

		while(t > 0)
		{
			a[s - t] = 0;
			t--;
		}

		System.out.print("\narr = [");
		for(i = 0; i < s; i++)
		{
			if(i == s - 1)
			{
				System.out.print(a[i] + "]");
			}
			else
			{
				System.out.print(a[i] + ", ");
			}
		}
	}
}