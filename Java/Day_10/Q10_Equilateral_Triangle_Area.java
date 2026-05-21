/*
Q10. Write a Java program to calculate the area of an equilateral triangle. 
Input : Side = 6 
Output : Area = 15.59 
Explanation : Area is calculated using the formula for equilateral triangles. 
*/

import java.lang.Math;

public class Q10_Equilateral_Triangle_Area 
{
	public static void main(String X[])
	{
		int Side = Integer.parseInt(X[0]);
		double Area = (Math.sqrt(3) / 4) * Side * Side;
		System.out.printf("Area = %.2f", Area);
	}
}