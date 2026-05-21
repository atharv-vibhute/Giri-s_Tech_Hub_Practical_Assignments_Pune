/*
Q22. Write a Java program to find the first and last digit of a three-digit number without using a loop.
 Input : 456
 Output:
 First = 4
 Last = 6
 Explanation : Division and modulus operations are used.
*/

public class Q22_Digits_Find
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		int l = n % 10;
		n = n / 10;
		n = n / 10;
		int f = n;

		System.out.println("First = " + f);
		System.out.println("Last = " + l);	
	}
}