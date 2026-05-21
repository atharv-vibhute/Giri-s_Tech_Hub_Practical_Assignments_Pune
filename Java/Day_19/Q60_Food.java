/*
Q60. Create a Java program to simulate a basic food ordering system using switch:
 1: Burger
 2: Pizza
 3: Pasta
 4: Sandwich
 Display the price for the selected item.
Explanation: Switch on food item number. Print item name and price. Default for invalid selection.
*/

public class Q60_Food
{
	public static void main(String X[])
	{
		int f = Integer.parseInt(X[0]);
		switch(f)
		{
			case 1:
				System.out.println("Burger: Rs.90");
				break;

			case 2:
				System.out.println("Pizza: Rs.200");
				break;

			case 3:
				System.out.println("Pasta: Rs.80");
				break;

			case 4:
				System.out.println("Sandwich: Rs.50");
				break;

			default:
				System.out.println("Invaild Selection");
		}
	}
}