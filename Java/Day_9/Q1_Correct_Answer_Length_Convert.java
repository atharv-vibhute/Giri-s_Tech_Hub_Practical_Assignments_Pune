// Q 1. Write a java program to enter length in centimeter and convert into meter and kilometer. 

public class Q1_Correct_Answer_Length_Convert 
{
	public static void main(String X[])
	{
		int cm = Integer.parseInt(X[0]);
		int km = cm / 100000;
		cm = cm - km * 100000;
		int m = cm / 1000;
		cm = cm - m * 1000;
		System.out.println(km + "km " + m + "m " + cm + "cm");
	}
}