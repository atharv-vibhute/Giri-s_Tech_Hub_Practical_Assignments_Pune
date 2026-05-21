/*
Q28. Write a java program to Check Number Is Spy Number or Not.
Example : A number is said to be a Spy number if the sum of all the digits is equal to the product of all digits.
 	Input : 1412
	Output : Spy Number
	Explanation :
	sum = (1 + 4 + 1 + 2) = 8
	product = (1 * 4 * 1 * 2) = 8
	since, sum == product == 8
*/

public class Q28_Spy_Number
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		int s = 0;
		int m = 1;
		int d;

		do
		{
			d = n % 10;
			n = n / 10;
			s = s + d;
			m = m * d;
		} while(n != 0);

		System.out.println((s == m)? "Spy Number" : "Not Spy Number");
	}
}
