/*
Q51: Write a Java program using a switch case to input a month number (1-12) and display the number of days in that month. Consider leap year for February.
Explanation: Use a switch for month numbers. For February, check if the year is a leap year using an if condition inside the case.
*/

public class Q51_Month_Day
{
	public static void main(String X[])
	{
		int m = Integer.parseInt(X[0]);
		switch(m)
		{
			case 1:
				System.out.println("31 Days");
				break;

			case 2:
				System.out.println("29 Days");
				break;

			case 3:
				System.out.println("31 Days");
				break;

			case 4:
				System.out.println("30 Days");
				break;

			case 5:
				System.out.println("31 Days");
				break;

			case 6: 
				System.out.println("30 Days");
				break;

			case 7:
				System.out.println("31 Days");
				break;

			case 8:
				System.out.println("31 Days");
				break;

			case 9:
				System.out.println("30 Days");
				break;

			case 10:
				System.out.println("31 Days");
				break;

			case 11:
				System.out.println("30 Days");
				break;

			case 12:
				System.out.println("31 Days");
				break;

			default:
				System.out.println("Wrong Choice");
		}
	}
}

