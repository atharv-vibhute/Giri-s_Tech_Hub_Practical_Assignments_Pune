/*
Q34. Write a Java program to check whether a number is positive, negative, or zero.
 Input : Number = -8
 Output : Negative
 Explanation : If the number is less than zero, it is negative.
*/

public class Q34_Number
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		String s = (n > 0)? "Positive" : (n < 0)? "Negative" : "Zero";
		System.out.println(s);
	}
}

