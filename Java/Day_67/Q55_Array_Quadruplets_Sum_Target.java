/*
Q55. Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:
	0 <= a, b, c, d < n
	a, b, c, and d are distinct.
	nums[a] + nums[b] + nums[c] + nums[d] == target
You may return the answer in any order.
Example 1:
Input: nums = [1,0,-1,0,-2,2], target = 0
Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
Example 2:
Input: nums = [2,2,2,2,2], target = 8
Output: [[2,2,2,2]]
Constraints:
	1 <= nums.length <= 200
	-109 <= nums[i] <= 109
	-109 <= target <= 109
*/
import java.util.Scanner;

public class Q55_Array_Quadruplets_Sum_Target
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int s = sc.nextInt();
		int a[] = new int[s];
		int i, j, k, l, t;
		boolean b = false;

		System.out.println("Enter the array elements: ");
		for(i = 0; i < s; i++)
		{
			a[i] = sc.nextInt();
		}
		
		System.out.println("Enter the target sum: ");
		t = sc.nextInt();
		sc.close();

		for(i = 0; i < s - 3; i++)
		{
			for(j = i + 1; j < s - 2; j++)
			{
				for(k = j + 1; k < s - 1; k++)
				{
					for(l = k + 1; l < s; l++)
					{
						if(a[i] + a[j] + a[k] + a[l] == t)
						{
							b = true;
							System.out.println("[" +a[i] + " " + a[j] + " " + a[k] + " " + a[l] + "]");
						}
					}
				}
			}
		}

		if(b == false)
		{
			System.out.println("The pair is not found.");
		}
	}
}