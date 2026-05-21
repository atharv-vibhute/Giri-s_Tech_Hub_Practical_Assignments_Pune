/*
Q17. Write a Java program to convert seconds into hours, minutes, and seconds.
 Input : Seconds = 3665
 Output:
 Hours = 1
 Minutes = 1
 Seconds = 5
 Explanation : Seconds are converted step by step.
*/

public class Q17_Time_Convert
{
	public static void main(String X[])
	{
		int t = Integer.parseInt(X[0]);
		int h = t / 3600;
		t = t - h * 3600;
		int m = t / 60;
		t = t - m * 60;
		
		System.out.println("Hours = " + h);
		System.out.println("Minutes = " + m);
		System.out.println("Seconds = " + t);
	}
}