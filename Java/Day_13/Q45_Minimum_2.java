/*
Q45. Write a Java program to find the minimum between two numbers.
 Input:
 A = 8
 B = 12
 Output : Minimum = 8
 Explanation : 8 is smaller than 12.
*/

public class Q45_Minimum_2
{
	public static void main(String X[])
	{
		int A = Integer.parseInt(X[0]);
		int B = Integer.parseInt(X[1]);
		String s = (A >= B)? "Minimum = " + B : "Minimum = " + A;
		System.out.println(s);
	}
}