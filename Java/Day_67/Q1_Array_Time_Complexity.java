/*
Q1. Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
The overall run time complexity should be O(log (m+n)).
Example 1:
Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:
Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
Constraints:
	nums1.length == m
	nums2.length == n
	0 <= m <= 1000
	0 <= n <= 1000
	1 <= m + n <= 2000
	-106 <= nums1[i], nums2[i] <= 106
*/
import java.util.Scanner;

public class Q1_Array_Time_Complexity
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		int i, j, m, n, k;
		float x;
		float s = 0f;

		System.out.println("Enter the size of the first array: ");
		m = sc.nextInt();
		int a[] = new int[m];

		System.out.println("Enter the first array elements: ");
		for(i = 0; i < m; i++)
		{
			a[i] = sc.nextInt();
		}

		System.out.println("Enter the size of the second array: ");
		n = sc.nextInt();
		int b[] = new int[n];

		System.out.println("Enter the second array elements: ");
		for(i = 0, j = m; i < n; i++, j++)
		{
			b[i] = sc.nextInt();
		}
		sc.close();

		i = 0;
		j = 0;
		int c[] = new int[m + n];

		for(k = 0; k < m + n; k++)
		{
			if(i != m & j != n)
			{
				if(a[i] > b[j])
				{
					c[k] = b[j];
					j++;
				}
				else
				{
					c[k] = a[i];
					i++;
				}
			}
			else if(i == m)
			{
				c[k] = b[j];
				j++;
			}
			else
			{
				c[k] = a[i];
				i++;
			}
		}

		s = (m + n) / 2.0f;
		k = (m + n) / 2;
		x = s - k;

		if(x == 0)
		{
			s = (c[k - 1] + c[k]) / 2.0f;
			System.out.println(s);
		}
		else
		{
			s = c[k];
			System.out.println(s);
		}
	}
}