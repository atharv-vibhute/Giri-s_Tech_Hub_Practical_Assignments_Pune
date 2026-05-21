/*
Q53. Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target. 
You may assume that each input would have exactly one solution, and you may not use the 
same element twice. 
You can return the answer in any order. 
Example 1: 
Input: nums = [2,7,11,15], target = 9   
Output: [0,1] 
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
*/
import java.util.Scanner;

public class Q53_Array_Addition_Target
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int s = sc.nextInt();
		int a[] = new int[s];
		boolean f = false;
		int i, n;
		int j = 0;

		System.out.println("Enter the array elements: ");
		for(i = 0; i < s; i++)
		{
			a[i] = sc.nextInt();
		}

		System.out.println("Enter the target sum: ");
		n = sc.nextInt();
		sc.close();

		for(i = 0; i < s - 1; i++)
		{
			for(j = i + 1; j < s; j++)
			{
				if(a[i] + a[j] == n)
				{
					f = true;
					break;
				}
			}

			if(f)
			{
				break;
			}
		}

		if(f)
		{
			System.out.println("[" + i + ", " + j + "]");
		}
		else
		{
			System.out.println("The pair is not matched.");
		}
	}
}