/*
Q14. Write a Java program to swap two numbers using a third variable.
 Input: A = 5
           B = 10
 Output: A = 10
              B = 5
 Explanation : A temporary variable is used to swap values.
*/

public class Q14_Swap
{
	public static void main(String X[])
	{
		int A = Integer.parseInt(X[0]);
		int B = Integer.parseInt(X[1]);
		int C = A;
		A = B;
		B = C;
		System.out.println("A = " + A);
		System.out.println("B = " + B);
	}
}