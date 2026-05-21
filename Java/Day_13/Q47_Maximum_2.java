/*
Q47. Write a Java program to find the maximum between two numbers.
 Input:
 A = 14
 B = 9
 Output : Maximum = 14
 Explanation : 14 is greater than 9.
*/

public class Q47_Maximum_2
{
	public static void main(String X[])
	{
		int A = Integer.parseInt(X[0]);
		int B = Integer.parseInt(X[1]);
		String s = (A >= B)? "Maximum = "+A:"Maximum = "+B;
		System.out.println(s);
	}
}

