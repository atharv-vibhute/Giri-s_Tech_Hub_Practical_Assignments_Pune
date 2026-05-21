// Q 3. Write a java program to enter temperature in Celsius and convert it into Fahrenheit. Formula :- fah = (cel * 9 / 5) + 32; 

public class Q3_Temperature_Conversion_C_F 
{
	public static void main(String X[])
	{
		float ftc = Float.parseFloat(X[0]);
		float ftf = (ftc * 9 / 5) + 32;
		System.out.printf("Temperature in Fahrenheit is %.2f",ftf);
	}
}