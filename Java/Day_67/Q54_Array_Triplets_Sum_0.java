/*
Q54. Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
Notice that the solution set must not contain duplicate triplets.
Example 1:
Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation: 
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.
Example 2:
Input: nums = [0,1,1]
Output: [ ]
Explanation: The only possible triplet does not sum up to 0.
Constraints:
3 <= nums.length <= 3000
-105 <= nums[i] <= 105
*/
import java.util.Scanner;

public class Q54_Array_Triplets_Sum_0
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int s = sc.nextInt();
		int a[] = new int[s];
		boolean b = false;
		int i, j;
		int k = 0;

		System.out.println("Enter the array elements: ");
		for(i = 0; i < s; i++)
		{
			a[i] = sc.nextInt();
		}
		sc.close();

		for(i = 0; i < s - 2; i++)
		{
			for(j = i + 1; j < s - 1; j++)
			{
				for(k = j + 1; k < s; k++)
				{
					if(a[i] + a[j] + a[k] == 0 && i != j && j != k && i != k)
					{
						b = true;
						System.out.println("[" + a[i] + " " + a[j] + " " + a[k] + "]");
					}
				}
			}
		}

		if(b == false)
		{
			System.out.println("[ ]");
		}
	}
}