/*
Q43. Write a Java program to accept two integers and check whether they are equal.
 Input:
 A = 50
 B = 50
 Output : Equal
 Explanation : Both numbers have the same value.
*/

public class Q43_Equal_Check
{
	public static void main(String X[])
	{
		int a = Integer.parseInt(X[0]);
		int b = Integer.parseInt(X[1]);
		String s = (a == b)? "Equal":"Not Equal";
		System.out.println(s);
	}
}