/*
Q15. Write a Java program to swap two numbers without using a third variable.
 Input:
 A = 4
 B = 7
 Output:
 A = 7
 B = 4
 Explanation : Swapping is done using arithmetic operations.
*/

public class Q15_Swap_Without_Third
{
	public static void main(String X[])
	{
		int A = Integer.parseInt(X[0]);
		int B = Integer.parseInt(X[1]);
		A = A + B;
		B = A - B;
		A = A - B;
		System.out.println("A = " + A);
		System.out.println("B = " + B);
	}
}