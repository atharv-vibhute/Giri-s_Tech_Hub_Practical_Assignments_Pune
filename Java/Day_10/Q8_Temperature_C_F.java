/*
Q8. Write a Java program to convert temperature from Celsius to Fahrenheit. 
Formula: F = (C × 9 / 5) + 32 
Input  :  Celsius = 37 
Output  :  Fahrenheit = 98.6 
Explanation : Celsius value is converted using the formula. 
*/

public class Q8_Temperature_C_F 
{
	public static void main(String X[])
	{
		int Celsius = Integer.parseInt(X[0]);
		float Fahrenheit = ((float)Celsius * 9 / 5) + 32;
		System.out.println("Fahrenheit = " + Fahrenheit);
	}
}