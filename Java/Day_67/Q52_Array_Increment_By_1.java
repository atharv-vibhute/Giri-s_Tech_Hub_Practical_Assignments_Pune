/*
Q52. You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
Increment the large integer by one and return the resulting array of digits. 
Example 1: 
Input: digits = [1,2,3]    
Output: [1,2,4] 
Explanation: The array represents the integer 123. 
Incrementing by one gives 123 + 1 = 124. 
Thus, the result should be [1,2,4]. 
Example 2: 
Input: digits = [4,3,2,1]   
Output: [4,3,2,2] 
Explanation: The array represents the integer 4321. 
Incrementing by one gives 4321 + 1 = 4322. 
Thus, the result should be [4,3,2,2]. 
*/
import java.util.Scanner;

public class Q52_Array_Increment_By_1
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int s = sc.nextInt();
		int a[] = new int[s];
		int n = 0;
		int c = 0;
		int i, r, m;

		System.out.println("Enter the element of the array: ");
		for(i = 0; i < s; i++)
		{
			a[i] = sc.nextInt();

			n = n * 10 + a[i];
		}

		sc.close();
		n = n + 1;
		i = s - 1;

		while(n != 0)
		{
			r = n % 10;
			n = n / 10;
			a[i] = r;
			i--;
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