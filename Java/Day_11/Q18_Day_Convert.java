/*
Q18. Write a Java program to convert days into years, months, and weeks.
 Input : Days = 400
 Output:
 Years = 1
 Months = 1
 Weeks = 1
 Explanation : Days are divided into years, months, and weeks.
*/

public class Q18_Day_Convert
{
	public static void main(String X[])
	{
		int d = Integer.parseInt(X[0]);
		int y = d / 365;
		d = d - y * 365;
		int m = d / 30;
		d = d - m * 30;
		int w = d / 7;

		System.out.println("Years = " + y);
		System.out.println("Months = " + m);
		System.out.println("Weeks = " + w);
	}
}