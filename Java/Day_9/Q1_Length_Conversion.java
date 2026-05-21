// Q 1. Write a java program to enter length in centimeter and convert into meter and kilometer.

public class Q1_Length_Conversion 
{
	public static void main(String X[])
	{
		float flc = Integer.parseInt(X[0]);
		float flm = flc/100;
		float flkm = flm/1000;
		
		System.out.println("The entered length in meter is "+flm);
		System.out.println("The entered length in kilometer is "+flkm);
	}
}