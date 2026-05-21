/*
Q33. Write a Java program to check whether a triangle is equilateral, isosceles, or scalene.
 Input:
 Side1 = 5
 Side2 = 5
 Side3 = 5
 Output : Equilateral Triangle
 Explanation : All sides are equal, so the triangle is equilateral.
*/

public class Q33_Triangle_Types 
{
	public static void main(String X[])
	{
		int s1 = Integer.parseInt(X[0]);
		int s2 = Integer.parseInt(X[1]);
		int s3 = Integer.parseInt(X[2]);
		String s = (s1 == s2 && s2 == s3 && s3 == s1)? "Equilateral Triangle" : (s1 != s2 && s2 != s1 && s3 != s1)? "Scalene Triangle" : "Isosceles Triangle";
		System.out.println(s);
	}
}