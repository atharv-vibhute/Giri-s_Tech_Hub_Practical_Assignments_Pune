// Q 2. Write a java program to enter temperature in Fahrenheit and convert to Celsius. Formula :- cel = (fah - 32) * 5 / 9; 

public class Q2_Temperature_Conversion_F_C
{
	public static void main(String X[])
	{
		float ftf = Float.parseFloat(X[0]);		
		float ftc = ((ftf - 32) * 5 / 9);
		System.out.printf("Temperature in Celsius is %.2f",ftc); 
	}
}