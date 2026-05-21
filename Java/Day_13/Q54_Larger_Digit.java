/*
Q54. Write a Java program to print the larger digit between first and last digit of a three-digit number.
 Input : Number = 582
 Output : Larger Digit = 5
 Explanation : First digit 5 is greater than last digit 2.
*/

public class Q54_Larger_Digit
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		int r = n % 10;
		n = n / 10;
		n = n / 10;
		String s = (n >= r)? "Larger Digit = "+n : "Larger Digit = "+r;
		System.out.println(s);
	}
}