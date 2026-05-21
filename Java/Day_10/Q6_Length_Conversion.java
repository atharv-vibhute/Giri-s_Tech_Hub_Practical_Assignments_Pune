/*
Q6. Write a Java program to convert length from centimeter into meter and kilometer. 
Input  :  Centimeter = 150 
Output: 
Meter = 1.5 
Kilometer = 0.0015 
Explanation  :  Centimeter is converted using standard unit conversions. 
*/

public class Q6_Length_Conversion
{
	public static void main(String X[])
	{
		int Centimeter = Integer.parseInt(X[0]);
		float Meter = (float)Centimeter / 100;
		float Kilometer = Meter / 1000;
		
		System.out.println("Meter = " + Meter);
		System.out.println("Kilometer = " + Kilometer);
	}
}