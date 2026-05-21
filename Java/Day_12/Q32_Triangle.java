/*
Q32. Write a Java program to check whether a triangle is valid or not using its three angles.
 Input:
 Angle1 = 60
 Angle2 = 60
 Angle3 = 60
 Output : Valid Triangle
 Explanation : If the sum of all angles is exactly 180°, the triangle is valid.
*/

public class Q32_Triangle
{
	public static void main(String X[])
	{
		int a1 = Integer.parseInt(X[0]);
		int a2 = Integer.parseInt(X[1]);
		int a3 = Integer.parseInt(X[2]);
		String s = (a1 + a2 + a3 == 180)? "Valid Triangle" : "Not Valid Triangle";
		System.out.println(s);
	}
}