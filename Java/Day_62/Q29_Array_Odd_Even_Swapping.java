/*
Q29. Rearrange the array so that even and odd numbers alternate. Assume the number of even and odd elements is equal.
	Input :- arr = [1, 2, 3, 4, 5, 6]
	Output :-  [2, 1, 4, 3, 6, 5]
Explanation:
Even and odd elements are rearranged to appear alternately: Even → Odd → Even → Odd.
The relative order within even and odd groups may not be important, but alternation is maintained.
*/
import java.util.Scanner;

public class Q29_Array_Odd_Even_Swapping
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int s = sc.nextInt();
		int a[] = new int[s];
		int i, j, t;

		System.out.println("Enter the array elements: ");
		for(i = 0; i < s; i++)
		{
			a[i] = sc.nextInt();
		}
		sc.close();

		for(i = 0; i < s; i++)
		{
			j = i + 1;

			while(j < s)
			{
				if(i % 2 == 0 && a[i] % 2 != 0)
				{
					if(a[j] % 2 == 0)
					{
						t = a[i];
						a[i] = a[j];
						a[j] = t;
						break;
					}
				}
				else if(i % 2 != 0 && a[i] % 2 == 0)
				{
					if(a[j] % 2 != 0)
					{
						t = a[i];
						a[i] = a[j];
						a[j] = t;
						break;
					}
				}
				j++;
			}
		}

		System.out.print("\n[");
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