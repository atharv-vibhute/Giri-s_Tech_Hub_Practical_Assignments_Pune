/*
Q59. Write a program using switch that takes a number (1-4) and displays a season:
 1: Spring
 2: Summer
 3: Autumn
 4: Winter
Explanation: Simple switch with four cases and default for invalid input.
*/

public class Q59_Season
{
	public static void main(String X[])
	{
		int s = Integer.parseInt(X[0]);
		switch(s)
		{
			case 1:
				System.out.println("Spring");
				break;

			case 2:
				System.out.println("Summer");
				break;

			case 3:
				System.out.println("Autumn");
				break;

			case 4:
				System.out.println("Winter");
				break;

			default:
				System.out.println("Invaild Input");
		}
	}
}