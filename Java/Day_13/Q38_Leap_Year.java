/*
Q38. Write a Java program to check whether a given year is a leap year or not.
 Input : Year = 2024
 Output : Leap Year
 Explanation : A leap year is divisible by 4 and follows leap year rules.
*/

public class Q38_Leap_Year
{
	public static void main(String X[])
	{
		int y = Integer.parseInt(X[0]);
		String s = (y%4!=0)? "Not Leap Year": (y%100==0 && y%400!=0)? "Not Leap Year": "Leap Year";
		System.out.println(s);
	}
}