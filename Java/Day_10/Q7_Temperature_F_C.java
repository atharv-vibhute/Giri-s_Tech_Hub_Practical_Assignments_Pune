/*
Q7. Write a Java program to convert temperature from Fahrenheit to Celsius. 
Formula: C = (F − 32) × 5 / 9 
Input  :  Fahrenheit = 98 
Output  :  Celsius = 36.67 
Explanation  :  The given formula converts Fahrenheit to Celsius. 
*/

public class Q7_Temperature_F_C 
{
	public static void main(String X[])
	{
		int Fahrenheit = Integer.parseInt(X[0]);
		float Celsius = ((float)Fahrenheit - 32) * 5 / 9;
		System.out.printf("Celsius = %.2f", Celsius);
	}	
}