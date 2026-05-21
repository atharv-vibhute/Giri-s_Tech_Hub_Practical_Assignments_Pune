/*
Q12.Write a Java program to calculate simple interest.
 Input:
 Principal = 1000
 Rate = 5
 Time = 2
 Output : Simple Interest = 100
 Explanation : Simple interest formula is applied.
*/

public class Q12_Simple_Interest
{
	public static void main(String X[])
	{
		int p = Integer.parseInt(X[0]);
		int r = Integer.parseInt(X[1]);
		int t = Integer.parseInt(X[2]);

		int si = (p*r*t)/100;
		System.out.println("Simple Interest: " + si);
	}
}