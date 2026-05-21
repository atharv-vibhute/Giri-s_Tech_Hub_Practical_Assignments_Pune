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
		if(y%4!=0)
		{
			System.out.println("Not Leap Year");
		}
		else
		{
			if(y%100==0 && y%400!=0)
			{
				System.out.println("Not Leap Year");
			}
			else
			{
				System.out.println("Leap Year");
			}
		}
	}
}