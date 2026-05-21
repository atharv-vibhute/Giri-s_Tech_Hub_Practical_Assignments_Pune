// Q.12 Write a Java program to input time in seconds and convert it into hours, minutes, and seconds.

public class Q12_Time_Convert 
{
	public static void main(String X[])
	{
		int seconds = Integer.parseInt(X[0]);
		int hours = seconds / 3600;
		seconds = seconds - hours * 3600;
		int minutes = seconds / 60;
		seconds = seconds - minutes * 60;
		System.out.println(hours + " hours " + minutes + " miuntes " + seconds + " seconds");
	}
}