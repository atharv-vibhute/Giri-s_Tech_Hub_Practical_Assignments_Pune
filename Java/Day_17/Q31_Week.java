// Q31. Write a java program to input week number(1-7) and print the corresponding day of week name using if else. How to print day of week using if else in java programming.

public class Q31_Week
{
	public static void main(String X[])
	{
		int w = Integer.parseInt(X[0]);
		if(w == 1)
		{
			System.out.println("Monday");
		}
		else if(w == 2)
		{
			System.out.println("Tuesday");
		}
		else if(w == 3)
		{
			System.out.println("Wednesday");
		}
		else if(w == 4)
		{
			System.out.println("Thursday");
		}
		else if(w == 5)
		{
			System.out.println("Friday");
		}
		else if(w == 6)
		{
			System.out.println("Saturday");
		}
		else if(w == 7)
		{
			System.out.println("Sunday");
		}
	}
}