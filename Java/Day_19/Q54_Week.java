/*
Q54. Develop a Java program using switch to print the day type for an input day number (1-7):
1 for Monday, …, 7 for Sunday.
For 1-5, display “Weekday”; for 6-7, display “Weekend”.
Explanation: Use switch with multiple cases falling through for weekdays and weekends.
*/

public class Q54_Week
{
	public static void main(String X[])
	{
		int d = Integer.parseInt(X[0]);
		switch(d)
		{
			case 1:
				System.out.println("Monday");
				System.out.println("Weekday");
				break;

			case 2:
				System.out.println("Tuesday");
				System.out.println("Weekday");
				break;

			case 3:
				System.out.println("Wednesday");
				System.out.println("Weekday");
				break;

			case 4: 
				System.out.println("Thursday");
				System.out.println("Weekday");
				break;

			case 5:
				System.out.println("Friday");
				System.out.println("Weekday");
				break;

			case 6:
				System.out.println("Saturday");
				System.out.println("Weekend");
				break;

			case 7: 
				System.out.println("Sunday");
				System.out.println("Weekend");
				break;

			default:
				System.out.println("Wrong Choice");
		}
	}
}