/*
Q23. Write a Java program to calculate the sum of the first and last digit without using a loop.
 Input : 123
 Output : 4
 Explanation : 1 + 3 = 4.
*/

public class Q23_Sum_First_Last
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		int s = n % 10;
		n = n / 10;
		n = n / 10;
		s = s + n;
		System.out.println(s);
	}
}