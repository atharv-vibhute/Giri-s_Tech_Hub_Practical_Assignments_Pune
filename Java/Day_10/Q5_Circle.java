/*
Q5. Write a Java program to enter the radius of a circle and calculate its diameter, area, and circumference. 
Input  :  Radius = 7 
Output: 
Diameter = 14 
Area = 153.86 
Circumference = 43.96 
Explanation: 
Formulas are applied using the given radius. 
*/

public class Q5_Circle
{
	public static void main(String X[])
	{
		int Radius = Integer.parseInt(X[0]);
		int Diameter = 2 * Radius;
		float Area = 3.142f*(float)Radius*(float)Radius;
		float Circumference = 3.142f*(float)Diameter;

		System.out.println("Diameter = " + Diameter);
		System.out.printf("Area = %.2f\n", Area);
		System.out.printf("Circumference = %.2f", Circumference);
	} 
}