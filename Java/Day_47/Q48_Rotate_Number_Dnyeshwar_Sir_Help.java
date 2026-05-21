/*
Q48. Task: Take an integer n and an integer k. Rotate the number n by k places to the left without using arrays or strings.

Example: n = 123456, k = 2 → output 345612.
Hint: Use modulus and division to split and rearrange digits.
*/

import java.util.Scanner;

public class Q48_Rotate_Number_Dnyeshwar_Sir_Help
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int t = n;
		int r;
		int c = 0;
		int i = 1;

		System.out.println("Enter the rotate number: ");
		int k = sc.nextInt();

		int x = 1;

		do
		{
			t = t / 10;
			c++;
		} while(t != 0);

		do
		{
			x = x * 10;
			i++;
		} while(i < c);

		i = 0;

		do
		{
			r = n % x;
			n = n / x;
			n = r * 10 + n;
			i++;
		} while(i < k);

		System.out.println(n);	
	}		
}