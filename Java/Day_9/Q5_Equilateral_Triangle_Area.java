// Q 5. Write a java program to calculate area of an equilateral triangle. 

import java.lang.Math;

public class Q5_Equilateral_Triangle_Area 
{
	public static void main(String X[])
	{
		float fs = Float.parseFloat(X[0]);
		double da = (Math.sqrt(3)/4)*fs*fs;
		System.out.printf("Area of Equilateral Triangle is %.2f",da);
	}
}